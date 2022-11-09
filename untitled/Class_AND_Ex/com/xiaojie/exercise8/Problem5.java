package com.xiaojie.exercise8;

public class Problem5 {

    static double Divid(int a, int b) {
        if(b == 0)
            throw(new ArithmeticException("Divid By zero is not allow"));
        return (a/b);
    }

    public static void main(String[] args) {
        int x = 6, y = 3;
        int x1 = 3, y1 = 0;
        try {
            double result = Divid(x, y);
            //double result = Divid(x1, y1);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
