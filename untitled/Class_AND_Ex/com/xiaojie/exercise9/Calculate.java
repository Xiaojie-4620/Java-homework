package com.xiaojie.exercise9;

import java.util.Random;

public class Calculate {
    /**
     * 生成随机三位数
     */
    public static int randomMake(){
        //int i=(int)(Math.random()*900)+100;
        return new Random().nextInt(900)+100;
    }

    public static void main(String[] args) {
        int number1 = randomMake();
        int number2 = randomMake();

        System.out.println("The Random number is：" + number1 + " And " + number2);
        // ADD
        System.out.println(Math.addExact(number1, number2));

        // reduce
        System.out.println(Math.subtractExact(number1, number2));

        // multiply
        System.out.println(Math.multiplyExact(number1, number2));

        // Max
        System.out.println(Math.max(number1, number2));

        // Min
        System.out.println(Math.min(number1, number2));
    }
}
