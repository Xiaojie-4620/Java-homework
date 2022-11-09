package com.xiaojie.exercise7_2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ElectircCalculator calculator = new ElectircCalculator();
        double a, b;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a 和 b 的值进行运算:");
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println("请输入 n 以计算其阶乘:");
        n = in.nextInt();
        System.out.println("输出 a 和 b 的和:");
        System.out.println(calculator.add(a,b));
        System.out.println("输出 b 除以 a 的值:");
        System.out.println(calculator.divide(b,a));
        System.out.println("输出 a 和 b 的差:");
        System.out.println(calculator.reduce(a,b));
        System.out.println("输出 a 和 b 的乘积:");//
        System.out.println(calculator.multiply(a,b));
        System.out.println("输出 a 对 b 的模:");
        System.out.println(calculator.residue((int)a,(int)b));
        System.out.println("输出 n 的 阶乘:");
        System.out.println(calculator.factorial(n));
    }
}
