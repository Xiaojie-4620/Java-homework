package com.xiaojie.exercise7_3_1;

public class Test {

    public static void main(String[] args) {

        Employee zhuguan = new Management("zhangsan", 35, "man", "人事部经理", 10000);
        zhuguan.toStr();

        Employee yuangong = new Employees("lisi", 23, "woman", "码农", 7000);
        yuangong.toStr();
    }
}
