package com.xiaojie.exercise11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Operator1 {
    public static void main(String[] args) throws IOException {
        Student stu1 = new Student("zhangsan", 1001, 12, "计算机", "是");
        Student stu2 = new Student("lisi", 1002, 14, "计算机", "否");
        File file = new File("untitled/Class_AND_Ex/com/xiaojie/exercise11/ex11/test.txt");
        FileOutputStream fw = new FileOutputStream(file);
        byte[] message1 = stu1.toString().getBytes();
        byte[] message2 = stu2.toString().getBytes();

        fw.write(message1);
        fw.write("\r\n".getBytes());
        fw.write(message2);

        fw.close();
    }
}
