package lecture2.advaced.oop.homework.school.school.classes;

public class Discipline {
    private String name;
    private int countExercises;
    private int countLessons;


    public Discipline(String name, int countExercises, int countLessons) {
        this.name = name;
        this.countExercises = countExercises;
        this.countLessons = countLessons;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", countExercises=" + countExercises +
                ", countLessons=" + countLessons +
                '}';
    }
}
