package com.xiaojie.exercise6_1;

public class Student {
    private int id;
    private int age;
    private double score;
    private static int studentCount;

    public Student(){
        studentCount++;
    }

    public Student(int id, int age, double score) {
        this.id = id;
        this.age = age;
        this.score = score;
        studentCount++;
    }
    //  静态方法返回学生数量
    public static int getCount() {
        return studentCount;
    }

//    public double average(Student stu) {
//
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void outString() {
        System.out.println("Student's " +
                "id=" + id +
                ", age=" + age +
                ", score=" + score
                //", studentNumbers=" + getCount() +
                );
    }
}
