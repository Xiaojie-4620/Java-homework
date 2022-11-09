package com.xiaojie.exercise4;

import java.util.Scanner;

public class Sort {
    static void sort (int []a){
        int len = a.length;
        int temp = 0;
        for(int i = 0; i < len - 1; ++i){
           // boolean flag = true;
            for(int j = 0; j < len - i - 1; ++j){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    //flag = false;
                }
                //if(flag) break;
            }
        }
        for(int i = 0; i < len; ++i )
            System.out.printf("%d ",a[i]);
    }
    public static void main(String[] args) {
        int []a = new int[10];
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Please input 10 numbers(and the number is less than 100)");
        for(i = 0; i < 10; ){
            int num = in.nextInt();
            if(num > 100)
                System.out.println("The number is too big, please input again");
            else {
                a[i] = num;
                i++;
            }
            //if(i == 10) break;
        }
        sort(a);
    }
}
