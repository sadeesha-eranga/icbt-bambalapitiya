package com.example.jsp_app;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2020-12-20
 */
public class Student {

    private String id;
    private String name;
    private String nic;

    public Student() {
    }

    public Student(String id, String name, String nic) {
        this.id = id;
        this.name = name;
        this.nic = nic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
