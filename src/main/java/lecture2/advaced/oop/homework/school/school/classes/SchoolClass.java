package lecture2.advaced.oop.homework.school.school.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SchoolClass {
    private List<Teacher> teachers;
    private String textId;
    private List<Student> students;
    private Set<Integer> studentIds;
    private static Set<String> classesIds = new HashSet<String>();

    public SchoolClass(List<Teacher> teachers, List<Student> students, String textId) {
        this.teachers = teachers;
        this.students = new ArrayList<Student>();
        this.studentIds = new HashSet<Integer>();
        this.addTextId(textId);
        this.addStudents(students);


    }

    private void addTextId(String textId) {

        if (classesIds.add(textId)) {
            this.setTextId(textId);
            System.out.println("OK text id " + textId + " is set to current class");
        } else {
            throw new RuntimeException("Error text id " + textId + " is not set to current class because  such a text id already exist");

        }

    }

    private void removeTextId(String textId) {

        classesIds.remove(textId);

    }

    public void addStudent(Student student) {

        if (studentIds.add(student.getId())) {
            students.add(student);
            System.out.println("OK student with name " + student.getName() + " and unique id " + student.getId() + " is added to current class with  text id " + this.textId);
        } else {
            System.out.println("ERROR student with  unique id " + student.getId() + " already exists. " + student.getName() + " Won't be added");
        }

    }

    public void removeStudent(Student student) {
        students.remove(student);
        studentIds.remove(student.getId());
        System.out.println("OK student with name " + student.getName() + " and unique id " + student.getId() + " is removed from current class with  text id " + this.textId);
    }

    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);
        System.out.println("OK teacher with name " + teacher.getName() + " is added to current class with  text id " + this.textId);

    }

    public void printAllStudents() {

        for (Student currStudent : this.students) {
            System.out.println("Student with name " + currStudent.getName() + " and unique id " + currStudent.getId() + " is a part of current class");
        }

    }

    private void addStudents(List<Student> students) {

        for (Student currStudent : students) {
            this.addStudent(currStudent);
        }

    }


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getTextId() {
        return textId;
    }

    public void setTextId(String textId) {
        this.textId = textId;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "teachers=" + teachers +
                ", textId='" + textId + '\'' +
                ", students=" + students +
                ", studentIds=" + studentIds +
                '}';
    }
}
