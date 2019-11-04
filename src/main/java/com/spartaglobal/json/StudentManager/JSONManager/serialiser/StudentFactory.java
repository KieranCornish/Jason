package com.spartaglobal.json.StudentManager.JSONManager.serialiser;



public class StudentFactory {
    private String firstName;
    private String lastName;
    private String degree;
    private int age;

    public StudentFactory(String firstName, String lastName, String degree, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
