package com.xiaojie.exercise9;

import java.util.Random;
import java.util.Scanner;

public class IsVip {

    public static void main(String[] args) {
        Random r = new Random();
        int judge = r.nextInt(10);
        int vipNumber;
        Scanner in = new Scanner(System.in);
        vipNumber = Integer.parseInt(in.next());
        in.close();
        // 判断随机数是否为会员
        int hundredNum = (vipNumber / 100 ) % 10;
        System.out.println("The vip judge number is :" + judge);
        System.out.println("Your vip judge number is :" + hundredNum);
        if(hundredNum == judge)
            System.out.println("Is Vip");
        else
            System.out.println("You are not Vip");
    }
}
