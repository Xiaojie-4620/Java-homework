package com.xiaojie.exercise10;

import java.util.*;
import java.util.stream.Collector;


public class Test1 {

    public static void main(String[] args) {
        Student stu1 = new Student(1, "zhangSan", "男");
        Student stu2 = new Student(2, "LiSi", "女");
        Student stu3 = new Student(3, "WangWu", "男");
        Student stu4 = new Student(4, "ZhaoLiu", "男");
        Student stu5 = new Student(5, "LiuYi", "女");
        ArrayList<Student> list = new ArrayList<>();
        CollectionUtil.addAllElement(list, stu1, stu2, stu3, stu4, stu5);
        System.out.println("------------------------------------------------------Arraylist 操作----------------------------------------------------");
        //遍历
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).gender.equals("男")) System.out.print("男 ");
            else System.out.print("女 ");
        }
        System.out.println("");
        // 迭代器遍历
        ListIterator<Student> it = list.listIterator();
        while (it.hasNext()) {
            var stu = it.next();
            if (stu.gender.equals("男")) System.out.print("男 ");
            else System.out.print("女 ");
            //it.next();
        }

        System.out.println("\n将其按照id从小到大输出:");
        ArrayList<Student> list2 = new ArrayList<>();
        CollectionUtil.addAllElement(list2, stu2, stu3, stu5, stu1, stu4);
        System.out.println("原来的顺序");
        System.out.println(list2);
        list2.sort((Student o1, Student o2) -> {
            return o1.id - o2.id;
        });
        System.out.println("按照ID从小到大排序: ");
        System.out.println(list2);
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        System.out.println("----------------------------HashSet操作-------------------------------------------------------------------------------");
        HashSet<Student> hashSet = new HashSet<>();
        CollectionUtil.pushAllElement(hashSet, stu2, stu1, stu3, stu4, stu5);
        System.out.println("HashSet中的数据为: ");
        System.out.println(hashSet);
        // 遍历
        List<Student> hashSet1 = new ArrayList<>(hashSet);
        for (int i = 0; i < hashSet.size(); ++i) {
            if (hashSet1.get(i).gender.equals("男")) System.out.print("男 ");
            else System.out.print("女 ");
        }
        System.out.println("");
        // 迭代器遍历
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            var stu = iterator.next();
            if (stu.gender.equals("男")) System.out.print("男 ");
            else System.out.print("女 ");
        }
        List<Student> hashSet2 = new ArrayList<>(hashSet);
        System.out.println("\n按照ID从小到大排序: ");
        hashSet2.sort((Student o1, Student o2) -> {
            return o1.id - o2.id;
        });
        System.out.println(hashSet2);
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------TreeSet操作-------------------------------------------------------------------------------");
        Set<Student> treeSet = new TreeSet<>();
        System.out.println("list2的内容为：");
        System.out.println(hashSet);
        treeSet.addAll(hashSet);
        System.out.println("treeSet中的内容为：");
        System.out.println(treeSet);
        // 遍历
        List<Student> treeSet1 = new ArrayList<>(treeSet);
        for(int i = 0; i < treeSet.size(); ++i) {
            if(treeSet1.get(i).gender.equals("男")) System.out.print("男 ");
            else System.out.print("女 ");
        }
        System.out.println("");
        //迭代器遍历
        for(Iterator<Student> iter = treeSet.iterator(); iter.hasNext();) {
            var stu = iter.next();
            if(stu.gender.equals("男"))  System.out.print("男 ");
            else System.out.print("女 ");
        }
        System.out.println(" ");
        treeSet.forEach(i -> System.out.println(i));
        Student.max(stu3, stu4);
    }
}
