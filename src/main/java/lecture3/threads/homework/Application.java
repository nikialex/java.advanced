import lecture3.threads.homework.PrintCounter;
import lecture3.threads.homework.PrintStatus;
import lecture3.threads.homework.Program;
import lecture3.threads.homework.ReadConsole;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Application extends Thread {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ReadConsole console = new ReadConsole();

        Program program1 = new Program("pr1");
        Program program2 = new Program("pr2");
        Program program3 = new Program("pr3");
        Program program4 = new Program("pr4");
        Program program5 = new Program("pr5");
        Program program6 = new Program("pr6");
        Program program7 = new Program("pr7");
        Program program8 = new Program("pr8");
        Program program9 = new Program("pr9");
        Program program10 = new Program("pr10");


        ExecutorService readService = Executors.newFixedThreadPool(1);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executorCounter = Executors.newSingleThreadExecutor();

        Program.printStatus(Arrays.asList(program1, program2, program3, program4, program5, program6, program7, program8, program9, program10));
        PrintStatus printStatus = new PrintStatus(Arrays.asList(program1, program2, program3, program4, program5, program6, program7, program8, program9, program10));
        PrintCounter printCounter = new PrintCounter(Arrays.asList(program1, program2, program3, program4, program5, program6, program7, program8, program9, program10));
        boolean isNotShutDown = true;


        while (isNotShutDown) {
            Future<String> future = readService.submit(console.readConsole());
            String consoleCommand = future.get();

            List<Program> currPrograms = Program.startAllPrograms(Arrays.asList(program1, program2, program3, program4, program5, program6, program7, program8, program9, program10), consoleCommand);
            Program.stopAllPrograms(currPrograms, consoleCommand);

            printStatus.setThreads(currPrograms);
            executor.submit(printStatus);
            printCounter.setThreads(currPrograms);
            executorCounter.submit(printCounter);

            isNotShutDown = !Program.isAllProgramsReadyForShuttingDown(currPrograms, consoleCommand);

            if (!isNotShutDown) {
                try {
                    executor.shutdown();
                    executorCounter.shutdown();
                    readService.shutdown();
                } catch (Exception e) {
                    System.out.println("Some of the executors are not shut down");
                } finally {
                    if (!executor.isShutdown()) {
                        executor.shutdownNow();
                    }
                    if (!executorCounter.isShutdown()) {
                        executorCounter.shutdownNow();
                    }

                    if (!readService.isShutdown()) {
                        readService.shutdownNow();
                    }
                }
            }
        }
    }
}
