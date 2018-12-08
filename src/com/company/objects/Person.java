package com.company.objects;

public class Person {
    public int age;
    private String gender;
    private String name;
    private int weight;
    public Person() {
        age = 0;
    }

    public Person(int age, String gender, String name, int weight) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.weight = weight;
    }

    public void printAge() {
        System.out.println(age);
    }

    public void setName(String givenName) {
        name = givenName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
