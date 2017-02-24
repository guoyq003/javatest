package com.jd.thread.demo;

public class MyRunnableTest implements Runnable {
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
