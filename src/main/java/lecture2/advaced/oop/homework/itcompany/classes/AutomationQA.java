package lecture2.advaced.oop.homework.itcompany.classes;

import lecture2.advaced.oop.homework.itcompany.interfaces.QA;

public class AutomationQA implements QA {
    @Override
    public void verifySoftwareQuality() {
        System.out.println("tester verifies Sw");

    }

    public void writeAutomationTest() {
        System.out.println("tester writes tests");

    }
}
