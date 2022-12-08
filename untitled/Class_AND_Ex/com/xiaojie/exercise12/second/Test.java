package com.xiaojie.exercise12.second;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Main(),"Add");
        Thread t2 = new Thread(new Main(), "Add");
        Thread t3 = new Thread(new Main(), "Sub");
        Thread t4 = new Thread(new Main(), "Sub");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
