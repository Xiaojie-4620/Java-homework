package com.xiaojie.exercise7_3_1;

public class Management extends Employee{

    public String job;
    public int salary;

    public Management(String name, int age, String gender, String job, int salary) {
        super(name, age, gender);
        this.job = job;
        this.salary = salary;
    }

    public void toStr() {
        System.out.println("Management{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary='" + salary + '\'' +
                ", job='" + job + '\''+
                '}');
    }
}
