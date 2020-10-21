package com.company;

public class Student implements Comparable<Student>{
    private int IDNumber;
    private String name;
    private int age;
    private  int score;

    public Student (int IDNumber, String name, int age, int score)
    {
        this.IDNumber = IDNumber;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return this.getIDNumber() > o.getIDNumber() ? 1 : -1;
    }
}
