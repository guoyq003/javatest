package com.jd.thread.demo.synchronizeddemo;

public class NumberRunnable extends Thread {
    private Printer01 printer01;
    public NumberRunnable(Printer01 printer01){
        this.printer01 = printer01;
    }
    public void run(){
        for (int i=1;i<=52;i++){
            printer01.printNum(i);
        }
    }
}
