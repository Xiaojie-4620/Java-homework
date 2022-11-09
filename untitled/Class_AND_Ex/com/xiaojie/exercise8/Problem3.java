package com.xiaojie.exercise8;

public class Problem3 {
    public static void func() {
        try {
            throw new Exception();
            //System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
    }
    public static void main(String[] args) {
        try {
            func();
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
