package com.xiaojie.exercise10_1;

import java.util.*;

import static com.xiaojie.exercise10_1.Student.max;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student(6, "zhangSan", "男");
        Student stu2 = new Student(7, "LiSi", "女");
        Student stu3 = new Student(8, "WangWu", "男");
        Student stu4 = new Student(9, "ZhaoLiu", "男");
        Student stu5 = new Student(10, "LiuYi", "女");
        Student []stu = new Student[]{stu1, stu2, stu3, stu4, stu5};
        HashMap<Student,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < 5; ++i) {
            hashMap.put(stu[i],i);
        }
        /*for(var key : hashMap.keySet()) {
            System.out.println(key + ":" + hashMap.get(key));
        }*/
       /* Set<Map.Entry<Integer, Student>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/
        //hashMap.put(new Student(6,"gao","女"),8);
        hashMap.forEach((key, value) -> System.out.println(key + " = " + value));

        System.out.println("------------------------------TreeMap----------------------------");
        TreeMap<Student, Integer> treeMap = new TreeMap<>((Student o1, Student o2) -> {return o2.id - o1.id;});
       /* for(int i = 4; i >= 0; --i) {
            treeMap.put(stu[i], i);
        }*/
        for(int i = 0; i < 5; ++i)
            treeMap.put(stu[i], i);

        treeMap.forEach((key, value) -> System.out.println(key + " = " + value));

        max(stu5,stu2);
    }
}
