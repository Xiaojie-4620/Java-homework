package com.xiaojie.exercise4;

import java.util.Scanner;

public class SumAve {
    static void alu(int []a){
        int sum = 0;
        int len = a.length;
        for(int i = 0; i < len; ++i)
            sum += a[i];
        float average = sum / len;
        System.out.printf("The sum of five number is: %d\n", sum);
        System.out.printf("The average of five number is: %.2f\n", average);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []a = new int[5];
        int i = 0;
        System.out.println("Please input 5 number less than 100");
        for(i = 0; i < 5;){
            int num = in.nextInt();
            if(num >= 100) {
                System.out.println("The number is too big, please input again");
            }
            else {
                a[i] = num;
                i++;
            }
            //if(i == 5) break;
        }
        alu(a);
    }
}
