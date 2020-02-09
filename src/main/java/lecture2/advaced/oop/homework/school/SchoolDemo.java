package lecture2.advaced.oop.homework.school;

import lecture2.advaced.oop.homework.school.school.classes.*;

import java.util.Arrays;

public class SchoolDemo {
    public static void main(String[] args) {
        Discipline discipline1 = new Discipline("maths", 1, 2);
        Discipline discipline2 = new Discipline("History", 1, 2);

        Teacher teacher1 = new Teacher("Bogomilov", Arrays.asList(discipline1, discipline2));
        Teacher teacher2 = new Teacher("Angelova", Arrays.asList(discipline2));

        Student niki = new Student("niki", 12);
        Student eva = new Student("eva", 12);
        Student ivan = new Student("ivan", 13);

        SchoolClass nineA = new SchoolClass(Arrays.asList(teacher1), Arrays.asList(niki, eva), "nineA");
        SchoolClass nineA1 = new SchoolClass(Arrays.asList(teacher2), Arrays.asList(niki, eva, ivan), "nineB");

//        nineA.printAllStudents();
//        nineA.removeStudent(eva);
        nineA1.printAllStudents();


        School school = new School(Arrays.asList(niki, eva), Arrays.asList(nineA, nineA1), Arrays.asList(teacher1, teacher2), Arrays.asList(discipline1, discipline2));

        System.out.println(school.toString());


    }
}
