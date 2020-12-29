package com.example.jsp_app;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

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

    public static User authenticate(String username, String password) {
        User authenticatedUser = null;

        // Fetching user from the database
        User user = new User(username, password, "John", "Doe");

        // Authenticating user
        if (username.trim().equalsIgnoreCase("admin") && password.equals("Admin@123")) {
            authenticatedUser = user;
        }

        return authenticatedUser;
    }

    public static String authenticate(Cookie[] cookies, HttpSession session) {
        String user = null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("SES_ID")) {
                // Lookup for SES_ID cookie value from sessions
                Object sessionAttribute = session.getAttribute(cookie.getValue());
                if (sessionAttribute != null) {
                    user = sessionAttribute.toString();
                }
            }
        }

        return user;
    }
}
