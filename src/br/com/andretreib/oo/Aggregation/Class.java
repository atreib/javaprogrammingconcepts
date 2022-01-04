package br.com.andretreib.oo.Aggregation;

import java.util.ArrayList;

/**
 * In our "Class" class, we're creating an aggregation
 *   between our Student and Teacher classes.
 * They both exist by their own, and are aggregated in out Class class.
 *   A Class has students and a teacher, but the otherwise is false.
 */
public class Class {
    private ArrayList<Student> students = new ArrayList<>();
    private Teacher teacher;
    private String name;

    Class (String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void addStudent (Student student) {
        this.students.add(student);
    }

    public String getTeacher() {
        return this.teacher.getName();
    }

    public String getStudents() {
        if (students.isEmpty()) return "";
        ArrayList<String> studentsNames = new ArrayList<>();
        for (Student student : students) {
            studentsNames.add(student.getName());
        }
        return String.join(", ", studentsNames);
    }

    public String getName() {
        return this.name;
    }
}
