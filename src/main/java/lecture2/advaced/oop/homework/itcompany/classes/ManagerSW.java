package lecture2.advaced.oop.homework.itcompany.classes;

import lecture2.advaced.oop.homework.itcompany.interfaces.Manager;

public class ManagerSW implements Manager {
    @Override
    public void drinkCoffee() {
        System.out.println("ManagerSW wasting time");
    }

    @Override
    public void managePeople() {
        System.out.println("ManagerSW managing people");
    }
}
