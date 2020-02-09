package lecture2.advaced.oop.homework.itcompany.classes;

import lecture2.advaced.oop.homework.itcompany.interfaces.Developer;
import lecture2.advaced.oop.homework.itcompany.interfaces.Manager;
import lecture2.advaced.oop.homework.itcompany.interfaces.QA;
import lecture2.advaced.oop.homework.itcompany.interfaces.SystemAdmin;

public class CTO implements Developer, Manager, QA, SystemAdmin {

    @Override
    public void buildSoftware() {
        System.out.println("CTO implementing sw");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("CTO don't drink coffee");
    }

    @Override
    public void managePeople() {
        System.out.println("CTO managing people");
    }

    @Override
    public void makeReview() {
        System.out.println("CTO reviewing code");

    }

    @Override
    public void configureMachine() {
        System.out.println("CTO Configuring  machine");
    }

    @Override
    public void supportSoftware() {
        System.out.println("CTO supporting  sw");
    }


    @Override
    public void verifySoftwareQuality() {
        System.out.println("CTO Verify Sw");

    }


}
