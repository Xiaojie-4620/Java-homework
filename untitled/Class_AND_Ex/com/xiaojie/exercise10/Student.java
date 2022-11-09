package com.xiaojie.exercise10;

public class Student implements Comparable<Student> {
    public int id;
    public String name;
    public String gender;

    public Student(){}

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
    public int compareTo(Student o) {
        return  this.id - o.id;
    }

    @Override
    public String toString() {
       /* return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';*/
        return name + ","+ "id: " + id + ",gender: " + gender;
    }

    public static <T> void max(T t1, T t2) {
        //if (t1 instanceof com.xiaojie.exercise10_1.Student && t2 instanceof com.xiaojie.exercise10_1.Student) {
            if (((Student) t1).id > ((Student) t2).id)
                System.out.println("YES");
            else
                System.out.println("NO");
        //}
    }
}
