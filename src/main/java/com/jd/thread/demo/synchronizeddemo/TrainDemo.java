package com.jd.thread.demo.synchronizeddemo;

public class TrainDemo extends Thread {
    public TrainDemo(String name){
        super(name);
    }
    public void run(){
        synchronized (TrainDemo.class){
            System.out.println(getName()+"过山洞.....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
