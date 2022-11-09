package com.xiaojie.exercise5_1;

public class Student {
    double score;
    String name;
    //无参构造
    public Student() {

    }
    public Student(String name){
        this.name = name;
    }
    //有参构造（重载
    public Student(double score, String name) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void read() {
        System.out.println("Student's name is: " + name + " and his/her score is: " + score);
    }

}
