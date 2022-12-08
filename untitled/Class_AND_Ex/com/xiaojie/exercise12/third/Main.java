package com.xiaojie.exercise12.third;
public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "A");
        Thread t2 = new Thread(new MyThread(), "B");
        Thread t3 = new Thread(new MyThread(), "C");

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

