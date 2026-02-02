package com.spring_boot_course.spring_jdbc_test_project.Entities;

public class Users {
    int id;
    String name ;
    String email;

    public Users(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
