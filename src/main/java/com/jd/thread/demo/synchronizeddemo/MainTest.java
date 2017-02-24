package com.jd.thread.demo.synchronizeddemo;

/**
 * Created by guoyq on 2017/2/24.
 */
public class MainTest {
    public static void main(String[] args) {
        IceStreamDemo iceStreamDemo=new IceStreamDemo(10);
        Thread thread1=new Thread(iceStreamDemo,"大狗");
        Thread thread2=new Thread(iceStreamDemo,"二狗");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            iceStreamDemo.showResult();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
