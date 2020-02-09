package lecture2.advaced.oop.homework.school.school.classes;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<SchoolClass> classes;
    private List<Teacher> teachers;
    private List<Discipline> disciplines;



    public School(List<Student> students, List<SchoolClass> classes, List<Teacher> teachers, List<Discipline> disciplines) {
        this.students = students;
        this.classes = new ArrayList<SchoolClass>();
        this.teachers = teachers;
        this.disciplines = disciplines;
        this.classes=classes;

    }


    @Override
    public String toString() {
        return "School{" +
                "\n students=" + students +
                ",\n  classes=" + classes +
                ",\n  teachers=" + teachers +
                ",\n  disciplines=" + disciplines +
                '}';
    }
}
