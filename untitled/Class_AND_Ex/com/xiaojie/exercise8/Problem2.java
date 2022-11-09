package com.xiaojie.exercise8;

public class Problem2 {
    public static void main(String[] args) {
        int test = test(3, 5);
        System.out.println(test);
    }
    public static int test(int a, int b) {
        int result = a;
        try {
            if(a < 0 || b < 0)
                return 0;
            result = a + b;
            return result;
        } finally {
            System.out.println("reslut = " + (a - b));
        }
    }
}
