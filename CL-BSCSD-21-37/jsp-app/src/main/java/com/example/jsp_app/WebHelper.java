package com.example.jsp_app;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2020-12-20
 */
public class WebHelper {

    public static Student[] getStudents() {
        Student[] students = new Student[3];

        students[0] = new Student("S001", "John", "123121V");
        students[1] = new Student("S002", "Mary", "342341V");
        students[2] = new Student("S003", "Doe", "112323V");

        return students;
    }

    public static String getGreeting() {
        return "<a href=\"hello-servlet\">Hello Servlet</a>";
    }
}
