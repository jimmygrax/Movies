package com.example.demo;


public class Users {

    private int id;

    private String name;

    private Integer age;

    private String email;

  

    public Users() {

    }

    public Users(long id, String name, int age, String email) {
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.email = "";
    }

    // Getters y setters
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
