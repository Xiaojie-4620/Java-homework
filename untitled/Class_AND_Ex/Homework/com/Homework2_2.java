package Homework.com;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        System.out.println("请输入数组长度");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int []a = new int[len];
        for(int i = 0; i < len; ++i){
            //Scanner in_1 = new Scanner(System.in);
            a[i] = in.nextInt();
            //a[i] = c;
        }
        Arrays.sort(a);
        for(int i = 0; i < len; ++i){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
