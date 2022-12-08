package com.xiaojie.exercise12.second;

public class FinalVersion {
    /*
     * 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。
     */
    private int j;

    public static void main(String[] args) {
        FinalVersion tt = new FinalVersion();
        Inc inc = tt.new Inc();
        Dec dec = tt.new Dec();

        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(dec);
        Thread t3 = new Thread(inc);
        Thread t4 = new Thread(dec);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    private synchronized void inc() {
        j++;
        System.out.println(Thread.currentThread().getName() + " add:" + j);
    }

    private synchronized void dec() {
        j--;
        System.out.println(Thread.currentThread().getName() + " sub:" + j);
    }

    class Inc implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                inc();
            }
        }
    }

    class Dec extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                dec();
            }
        }
    }
}

