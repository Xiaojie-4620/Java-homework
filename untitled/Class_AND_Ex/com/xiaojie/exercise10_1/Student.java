package com.xiaojie.exercise10_1;

import java.util.HashMap;
import java.util.Objects;

public class Student implements Comparable<Student> {
    public int id;
    public static String name;
    public String gender;

    public Student() {
    }

    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    public static <T> void max(T t1, T t2) {
       //if (t1 instanceof Student && t2 instanceof Student) {
            if (((Student) t1).id > ((Student) t2).id)
                System.out.println("YES");
            else
                System.out.println("NO");
       // }
    }
}
