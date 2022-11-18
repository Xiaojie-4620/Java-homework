package com.xiaojie.exercise11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Operator4 {
    public static void main(String[] args) throws IOException {
        File rFile = new File("untitled/Class_AND_Ex/com/xiaojie/exercise11/ex11/read.txt");
        File wFile = new File("untitled/Class_AND_Ex/com/xiaojie/exercise11/ex11/write.txt");

        List<String> message = Files.lines(Paths.get(rFile.getPath())).collect(Collectors.toList());
        FileOutputStream fw = new FileOutputStream(wFile);
        for(int i = 0; i < message.size(); ++i) {
            int j = i + 1;
            byte[] wMessage = (j + ": " + message.get(i) + "\r\n").getBytes();
            fw.write(wMessage);
        }
        fw.close();
    }
}
