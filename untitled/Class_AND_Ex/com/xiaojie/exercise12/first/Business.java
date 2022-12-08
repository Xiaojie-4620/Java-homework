package com.xiaojie.exercise12.first;

public class Business {
    //这个类是执行任务的类
        private boolean flag = false;
        //flag为true，主线程执行
        public synchronized void mainMethod() {
            //是不是子线程在执行？是，继续等子线程执行完
            if (false == flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //执行主线程任务
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + i);
            }
            //轮到子线程执行了
            flag = false;
            //唤醒子线程。（一共就两个线程，子线程和主线程，所以唤醒的只能是子线程。）
            notify();
        }

        //flag为false，子线程执行
        public synchronized void subMethod() {
            //是不是主线程在执行？是，继续等主线程执行完
            if (true == flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //执行子线程任务
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + i);
            }
            //轮到主线程执行了
            flag = true;
            //唤醒主线程。（一共就两个线程，子线程和主线程，所以唤醒的只能是主线程。）
            notify();
        }
}
