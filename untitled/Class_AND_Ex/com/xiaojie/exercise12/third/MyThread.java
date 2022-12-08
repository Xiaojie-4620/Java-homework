package com.xiaojie.exercise12.third;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread implements Runnable {
    final Lock lock = new ReentrantLock();
    //private String name;

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("线程" + Thread.currentThread().getName() + ":" + i);
        }

    }
}
