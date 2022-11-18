package com.xiaojie.exercise11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Operator3 {
    public static void main(String[] args) throws IOException {
        Student stu1 = new Student("zhangSan", 1001, 12, "计算机", "是");
        Student stu2 = new Student("lisi", 1002, 14, "计算机", "否");
        File file = new File("untitled/Class_AND_Ex/com/xiaojie/exercise11/ex11/text1.txt");
        FileOutputStream fw = new FileOutputStream(file);
        ObjectOutputStream fWrite = new ObjectOutputStream(fw);
        fWrite.writeObject(stu1);
        fWrite.writeObject(stu2);

        fWrite.close();
        fw.close();

        List<Student> list = new ArrayList<>();
        FileInputStream fr = new FileInputStream(file);
        ObjectInputStream fReader = new ObjectInputStream(fr);
        while(true) {
            try {
                list.add((Student)fReader.readObject());
            } catch (EOFException | ClassNotFoundException e) {
                System.out.println("Read complete");
                break;
            }
        }
        fReader.close();
        fr.close();

        System.out.println(list.get(0));
    }
}
