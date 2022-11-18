package com.xiaojie.exercise11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//将文本倒序读出
public class Operator5 {
    public static void main(String[] args) throws IOException {
        File file = new File ("untitled/Class_AND_Ex/com/xiaojie/exercise11/ex11/reverse.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");//随机读写文件流
        //先写入
        String str = "莺啼岸柳弄春晴，柳弄春晴夜月明";
        for(int i=0;i<str.length();i++) {
            raf.writeChar(str.charAt(i));//在文件指针的当前位置写入i的最低2字节，其他丢弃）
            //一个英文字母(不分大小写)占一个字节的空间,英文标点占一个字节,
            //一个中文汉字占两个字节的空间． 中文标点占两个字节． 
            //一个二进制数字序列,一般为8位二进制数,如一个ASCII码就是一个字节

        }
        //再逆序读出
        long pointer=raf.getFilePointer();//将指针定位在最后的字节点上（也就是4）
        while(pointer>0) {//直到文本初
            raf.seek(pointer-2);//seek设置指针位置4-2=2；2-2=0；
            System.out.print(raf.readChar());
            pointer-=2;

        }
        raf.close();

    }
}