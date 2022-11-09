package com.xiaojie.exercise3;

import java.util.Scanner;

public class Factorial {
        static int Factorial(int []c) {
            int sum = 0;
            for(int k = 0; k < c.length; ++k) {
                int res = 1;
                for (int i = c[k]; i >= 1; --i) {
                    res *= i;
                }
                sum += res;
            }
            return sum;
        }
    public static void main(String[] args) {
            int i = 0;
            int sum = 0;
            int []a = new int [3];
            String output = "";
            Scanner input = new Scanner(System.in);
            System.out.println("Please input three number to calculate(the num is between 1 and 20):");
            while(true){
                int num = input.nextInt();
                if(num < 1 | num > 20) {
                    System.out.println("Your input is not allow");
                    continue;
                }
                a[i] = num;
                i++;
                if(i == 3) break;
            }
        System.out.println(Factorial(a));
        }
}
