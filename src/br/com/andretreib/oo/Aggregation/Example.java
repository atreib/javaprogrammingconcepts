package br.com.andretreib.oo.Aggregation;

public class Example {
    public static void main(String[] args) {
        Teacher teacherAndre = new Teacher("André");
        Student studentJoe = new Student("Joe");
        Student studentRalph = new Student("Ralph");

        Class devClass = new Class("Software Development", teacherAndre);
        devClass.addStudent(studentJoe);
        devClass.addStudent(studentRalph);

        System.out.println(
            String.format(
                "Our %s class is given by %s. Right now, %s are in the class.",
                devClass.getName(),
                devClass.getTeacher(),
                devClass.getStudents()
            )
        );

        System.out.println(
                String.format(
                        "Anyhow, our teacher object exists by itself, having its own behavior," +
                                "like, ie, we can get its name: $s",
                        teacherAndre.getName()
                )
        );

        System.out.println(
                String.format(
                        "The same works for our students %s and %s",
                        studentRalph.getName(),
                        studentJoe.getName()
                )
        );

        System.out.println("We can remove an student, create a new one and our class will still up and running!");
    }
}
