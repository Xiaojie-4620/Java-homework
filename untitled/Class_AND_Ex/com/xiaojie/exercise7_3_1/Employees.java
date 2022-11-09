package com.xiaojie.exercise7_3_1;

public class Employees extends Employee{
    public String department;
    public int salary;

    public Employees(String name, int age, String gender, String department, int salary) {
        super(name, age, gender);
        this.department = department;
        this.salary = salary;
    }

    public void toStr(){
        System.out.println("Employees{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\''+
                '}');
    }
}
