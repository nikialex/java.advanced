package lecture3.threads.homework;

import lecture3.threads.homework.Program;

import java.util.List;

public class PrintCounter implements Runnable {

    private List<Program> threads;


    public void setThreads(List<Program> threads) {
        this.threads = threads;

    }

    public PrintCounter(List<Program> threads) {
        this.threads = threads;

    }


    @Override
    public void run() {

        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Program.printCounter(this.threads);

    }
}
