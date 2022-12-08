package com.xiaojie.exercise12.second;

public class Main implements Runnable {
    private int count = 0;
    public int getCount() {
        return count;
    }
    Object lock = new Object();
    @Override
    public void run() {
        synchronized (lock) {
            if(Thread.currentThread().getName().equals("Add")) {
                count++;
                System.out.println(Thread.currentThread().getName() + "线程Run" + " 执行count++： " + count);
            }
            else {
                count --;
                System.out.println(Thread.currentThread().getName() + "线程Run" + " 执行count--： " + count);
            }
        }
    }
}
