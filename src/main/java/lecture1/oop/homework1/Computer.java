package lecture1.oop.homework1;

public class Computer {

    private int year;
    private double price;
    private boolean isNotebook;
    private double hardDiskMemory;
    private double freeMemory;
    private String operationSystem;

    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }


    public void changeOperationSystem(String newOperationSystem) {
        this.operationSystem = newOperationSystem;
    }

    public void useMemory(double memory) {
        if (memory >= this.freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            System.out.println("Free memory before used memory is "+this.freeMemory);
            this.freeMemory = this.freeMemory - memory;
            System.out.println("Free memory after used memory is "+this.freeMemory);
        }
    }


    @Override
    public String toString() {
        return "oop.Computer{" +
                "year=" + year +
                ", price=" + price +
                ", isNotebook=" + isNotebook +
                ", hardDiskMemory=" + hardDiskMemory +
                ", freeMemory=" + freeMemory +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }


}
