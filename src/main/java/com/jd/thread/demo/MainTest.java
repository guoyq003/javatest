package com.jd.thread.demo;

public class MainTest {
    public static void main(String[] args) {
        MyThreadTest mth1=new MyThreadTest();
        MyThreadTest mth2=new MyThreadTest("MyThreadTest");
        MyRunnableTest mth3=new MyRunnableTest();
        Thread thread3=new Thread(mth3);
        Thread thread4=new Thread(mth3,"MyTereadRunTest");
        mth1.start();
        mth2.start();
        thread3.start();
        thread4.start();
        //获得线程优先级
        System.out.println("线程优先级为:"+mth1.getPriority());
        System.out.println("线程优先级为:"+thread4.getPriority());
        //设置线程优先级
        mth1.setPriority(1);
        thread4.setPriority(Thread.MAX_PRIORITY);
        System.out.println("线程优先级为:"+mth1.getPriority());
        System.out.println("线程优先级为:"+thread4.getPriority());
        //线程是否活动
        System.out.println("线程是否活动:"+thread4.isAlive());
        System.out.println("线程状态为:"+thread3.getState());
        System.out.println("线程状态为:"+thread4.getState());

    }
}
