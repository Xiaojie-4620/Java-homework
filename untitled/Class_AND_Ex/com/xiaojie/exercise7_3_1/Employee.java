package com.xiaojie.exercise7_3_1;

public class Employee {

    public String name;
    public int age;
    public String gender;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee() {
    }

    public void toStr() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}');
    }
}
