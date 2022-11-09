package com.xiaojie.exercise5_1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        //student1.name = "Tom";
        //student1.score = 98.7;
        student1.setName("Tom");
        student1.setScore(98.7);
        Student student2 = new Student(97.6, "Alice");

        //分别调用 两个类的read函数输出相应的语句
        student1.read();
        System.out.print("\n");
        student2.read();

        Student stu1 = new Student("zhangsan");
        System.out.println(stu1);

    }
}
