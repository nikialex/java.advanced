package lecture2.advaced.oop.homework.itcompany;


import lecture2.advaced.oop.homework.itcompany.classes.*;

public class ITDemo {

    public static void main(String[] args) {

        SoftwareDeveloper dev = new SoftwareDeveloper();
        CTO cto = new CTO();
        DevOps devOps = new DevOps();
        ManagerSW manager = new ManagerSW();
        AutomationQA automationQA = new AutomationQA();

        dev.buildSoftware();
        dev.makeReview();

        cto.buildSoftware();
        cto.configureMachine();
        cto.drinkCoffee();
        cto.makeReview();
        cto.managePeople();
        cto.supportSoftware();
        cto.verifySoftwareQuality();

        devOps.buildSoftware();
        devOps.configureMachine();
        devOps.makeReview();
        devOps.supportSoftware();

        manager.drinkCoffee();
        manager.managePeople();

        automationQA.verifySoftwareQuality();
        automationQA.writeAutomationTest();


    }
}
