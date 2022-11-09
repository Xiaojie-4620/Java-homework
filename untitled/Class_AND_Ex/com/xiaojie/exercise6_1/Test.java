package com.xiaojie.exercise6_1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    // 外部方法求平均数
    public static void average(List<Student> st, int n) {
        double sum = 0;
        int num = Student.getCount();
        for(var student : st)
            sum += student.getScore();
        System.out.println("平均分为: " + sum / (n * 1.0));
    }

    public static void main(String[] args) {

        List<Student> stu = new ArrayList<>();
        stu.add(new Student(1001, 15, 98.2));
        stu.add(new Student(1002, 14, 94.2));
        stu.add(new Student(1003, 15, 87.6));
        stu.add(new Student(1004, 16, 96.5));
        stu.add(new Student(1005, 17, 97.4));

        // 输出学生数量
        System.out.println("班级一共有" + Student.getCount() + "名学生");

        // 输出学生信息
        for (var x : stu) {
            //System.out.println();
            x.outString();
            //System.out.printf(" %d\n", x.getCount());
        }
        // 调用方法求平均数
        average(stu, Student.getCount());
    }
}
