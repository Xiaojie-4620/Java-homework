package com.xiaojie.exercise4;

import java.util.Scanner;

public class Deduplication {
    static int [] unique(int []a){
        int len = a.length;
        boolean []c = new boolean[100];
        int times = 0;
        for(int i = 0; i < len; ++i){
            if(!c[a[i]]) {
                c[a[i]] = true;
                times++;
            }
            else continue;
        }
        int []d = new int[times];
        int j = 0;
        for(int i = 0; i < 100; ++i){
            if(c[i]) {
                d[j] = i;
                j++;
            }
        }
        return d;
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
        }
        int []newarr = unique(a);
        for(int k = 0; k < newarr.length; ++k)
            System.out.printf("%d ",newarr[k]);
    }
}
