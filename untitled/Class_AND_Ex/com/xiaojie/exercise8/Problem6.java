package com.xiaojie.exercise8;

import java.util.List;

// NullPointerException 表示所谓空指针异常，是因为用空（null）去调用属性或方法，null表示没有这个对象，既然没有这个对象，那么去调用他的属性和方法，就会报异常。
// ClassCastException 两个类型间转换不兼容时引发的运行时异常..类型强制转换异常。
// NegativeArraySizeException 静态创建数组时，数组长度不能为负数。如果创建时给数组长度为负数的话会抛出运行时异常
public class Problem6 {
    public static void main(String[] args) {
        Integer num = null;
        int []array1 = new int [100];
        try {
            String s = num.toString();

        } catch (NullPointerException e) {
            System.out.println("捕获到 NullPointer 异常");
        }
        try {
            Object a = new String("NUll");
            //a = Integer(a);
            System.out.println((Integer) a);
        } catch (ClassCastException e) {
                System.out.println("捕获到 ClassCast 异常");
        }

        try {
            int []array = new int[-500];
        } catch (NegativeArraySizeException e) {
            System.out.println("捕获到 NegativeArraySize 异常");
        }

        try {
            int c = array1[200];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到 ArrayIndexOutOfBounds 异常");
        }
    }
}
