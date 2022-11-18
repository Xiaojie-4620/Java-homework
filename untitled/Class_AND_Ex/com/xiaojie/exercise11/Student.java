package com.xiaojie.exercise11;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;
    private int age;
    private String major;
    private String isDangYuan;

    public Student(){}

    public Student(String message) {
        String[] defineMessage = message.split(",");
        this.name = defineMessage[0];
        this.id = Integer.parseInt(defineMessage[1]);
        this.age = Integer.parseInt(defineMessage[2]);
        this.major = defineMessage[3];
        this.isDangYuan = defineMessage[4];
    }

    public Student(String name, int id, int age, String major, String isDangYuan) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.major = major;
        this.isDangYuan = isDangYuan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIsDangYuan() {
        return isDangYuan;
    }

    public void setIsDangYuan(String isDangYuan) {
        this.isDangYuan = isDangYuan;
    }

    @Override
    public String toString() {
        return name + "," + id + "," + age + "," + major + "," + isDangYuan;
    }
}
