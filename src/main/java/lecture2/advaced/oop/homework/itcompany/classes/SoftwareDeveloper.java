package lecture2.advaced.oop.homework.itcompany.classes;

import lecture2.advaced.oop.homework.itcompany.interfaces.Developer;

public class SoftwareDeveloper implements Developer {
    @Override
    public void buildSoftware() {
        System.out.println("dev implementing sw");
    }

    @Override
    public void makeReview() {
        System.out.println("dev reviewing code");

    }
}
