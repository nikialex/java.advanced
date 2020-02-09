package lecture3.threads.homework;

import lecture3.threads.homework.Program;

import java.util.List;

public class PrintStatus implements Runnable {

    private List<Program> threads;

    public void setThreads(List<Program> threads) {
        this.threads = threads;

    }

    public PrintStatus(List<Program> threads) {
        this.threads = threads;

    }


    @Override
    public void run() {

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Program.printStatus(this.threads);

    }
}
