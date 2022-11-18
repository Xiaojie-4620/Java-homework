package com.xiaojie.exercise11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operator2 {
    public static void main(String[] args) throws IOException {
        //File file = new File("src\\Input.txt");
        String path = "untitled/Class_AND_Ex/com/xiaojie/exercise11/ex11/Input.txt";
        Stream<String> lines = Files.lines(Paths.get(path));
        List<String> message = lines.collect(Collectors.toList());
        Student[] stu = new Student[2];
        for(int i = 0; i < message.size(); ++i)
            stu[i] = new Student(message.get(i));

        System.out.println(stu[0]);
        System.out.println(stu[1]);
    }
}
