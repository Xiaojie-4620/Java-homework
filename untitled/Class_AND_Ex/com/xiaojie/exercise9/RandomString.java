package com.xiaojie.exercise9;

import java.util.Random;

public class RandomString {

     static String getRandomCharStr(int n) {
        String codes = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder randomStr = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            randomStr.append(codes.charAt(random.nextInt(52)));
        }
        return randomStr.toString();
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i)
            System.out.println(getRandomCharStr(7));
    }
}
