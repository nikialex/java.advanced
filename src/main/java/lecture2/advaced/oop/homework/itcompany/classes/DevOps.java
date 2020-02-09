package lecture2.advaced.oop.homework.itcompany.classes;

import lecture2.advaced.oop.homework.itcompany.interfaces.SystemAdmin;
import lecture2.advaced.oop.homework.itcompany.interfaces.Developer;

public class DevOps implements Developer, SystemAdmin {
    @Override
    public void configureMachine() {
        System.out.println("DevOps Configuring  machine");
    }

    @Override
    public void supportSoftware() {
        System.out.println("DevOps supporting  sw");
    }

    @Override
    public void buildSoftware() {
        System.out.println("DevOps implementing sw");
    }

    @Override
    public void makeReview() {
        System.out.println("DevOps reviewing code");

    }
}
