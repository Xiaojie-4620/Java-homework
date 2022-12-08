package com.xiaojie.exercise12.first;

/**
 *  实现子进程和父进程交替执行三次
 */
public class First {
        public static void main(String[] args) {
            Business bussiness = new Business();
            //子线程
            /*new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).start();*/
            new Thread(() -> {for(int i = 0; i < 3; ++i) bussiness.subMethod();}).start();
            //主线程
            for (int i = 0; i < 3; i++) {
                bussiness.mainMethod();
            }
        }
    }