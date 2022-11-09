package com.xiaojie.exercise3;

import java.util.Scanner;

public class Todayis {
    static void whatTheIsToday(int n){
        if(n == 1) System.out.println("Today is Monday");
        if(n == 2) System.out.println("Today is Tuesday");
        if(n == 3) System.out.println("Today is Wednesday");
        if(n == 4) System.out.println("Today is Thursday");
        if(n == 5) System.out.println("Today is Friday");
        if(n == 6) System.out.println("Today is Saturday");
        if(n == 7) System.out.println("Today is Sunday");
        if(n > 7 || n < 0) System.out.print("Yours input is error,Please input a num 1~7");
    }

    public static void main(String[] args) {
        System.out.print("please input a num between 1 and 7: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        whatTheIsToday(num);
    }
}
