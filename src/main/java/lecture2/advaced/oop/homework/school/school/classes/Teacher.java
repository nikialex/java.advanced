package lecture2.advaced.oop.homework.school.school.classes;

import java.util.List;

public class Teacher {
    private String name;
    private List<Discipline> disciplines;

    public Teacher(String name, List<Discipline> disciplines) {
        this.name = name;
        this.disciplines = disciplines;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }

}
