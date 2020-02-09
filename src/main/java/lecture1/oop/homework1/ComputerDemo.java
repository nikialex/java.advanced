package lecture1.oop.homework1;

public class ComputerDemo {

    public static void main(String[] args) {

        Computer laptop = new Computer(1976, 123.34, true, 200, 100, "Windows");
        Computer pc = new Computer(1976, 123.34, false, 200, 100, "Windows");

        System.out.println(pc.toString());
        laptop.useMemory(50);
        pc.changeOperationSystem("linux");
        System.out.println(pc.toString());
    }
}
