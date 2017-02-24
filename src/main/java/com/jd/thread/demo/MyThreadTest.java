package com.jd.thread.demo;

public class MyThreadTest extends Thread{
    public MyThreadTest(){
        super();
    }
    public MyThreadTest(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getId()+":"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
