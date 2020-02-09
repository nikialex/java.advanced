package lecture3.threads.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Program extends Thread implements Runnable {
    private AtomicBoolean isStopped = new AtomicBoolean(true);
    Thread thread;

    public Program(AtomicBoolean isStopped) {
        this.isStopped = isStopped;
    }

    public Program(String name) {
        this.thread = new Thread(name);
        this.setName(name);
        this.isStopped.set(false);
    }


    public Program start(String command) {
        command = command.trim().replaceAll(" ", "");
        String real = ("start " + this.getName()).trim().replaceAll(" ", "");

        if (command.equalsIgnoreCase(real)) {

            if (this.getState() == State.NEW) {
                this.isStopped.set(false);
                this.start();
                System.out.println(" thread " + this.getName() + " is started ");
                return this;
            } else if (this.isAlive()) {
                System.out.println(" thread " + this.getName() + " is alive ");
            } else {
                Program curr = new Program(this.getName());
                curr.start();
                System.out.println(" new thread " + curr.getName() + " is started ");
                return curr;
            }

        }
        return this;

    }

    public void stop(String command) {
        command = command.trim().replaceAll(" ", "");
        String real = ("stop " + this.getName()).trim().replaceAll(" ", "");

        if (command.equalsIgnoreCase(real) && this.isAlive()) {
            this.interrupt();
            this.isStopped.set(true);
            System.out.println(" thread " + this.getName() + " is stopped ");
        }
    }


    public static List<Program> startAllPrograms(List<Program> threads, String command) {

        List<Program> curPrograms = new ArrayList<>();

        threads.forEach(curThread -> {

            curThread.start(command);
            curPrograms.add(curThread);
        });


        return curPrograms;
    }


    public static void stopAllPrograms(List<Program> threads, String command) {


        threads.forEach(curThread -> {

            curThread.stop(command);

        });

    }

    public static boolean isAllProgramsReadyForShuttingDown(List<Program> threads, String command) {
        command = command.trim().replaceAll(" ", "");
        String real = ("shutdown ".trim().replaceAll(" ", ""));
        if (command.equalsIgnoreCase(real)) {


            System.out.println("Shutting down...");
            threads.forEach(curThread -> {

                curThread.stop("stop " + curThread.getName());

            });

            return true;

        }

        return false;
    }

    public void printStatus() {


        if (this.isAlive()) {
            System.out.println(this.getName() + " is  alive ");

        } else if (this.isInterrupted() || this.getState() == State.TERMINATED) {
            System.out.println(this.getName() + " is  interrupted");
        } else {
            System.out.println(this.getName() + " is in  other unknown state=> " + this.getState());
        }


    }

    public static void printStatus(List<Program> threads) {

        System.out.println("====================================================");
        threads.forEach(curThread -> {

            curThread.printStatus();
        });

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    public static void printCounter(List<Program> threads) {
        AtomicInteger counter = new AtomicInteger(0);
        threads.forEach(curThread -> {
            if (curThread.isAlive()) {
                counter.set(counter.get() + 1);
            }

        });
        System.out.println("++COUNTER IS " + counter);

    }

    @Override
    public void run() {
        while (!this.isStopped.get()) {
            super.run();
        }
    }
}
