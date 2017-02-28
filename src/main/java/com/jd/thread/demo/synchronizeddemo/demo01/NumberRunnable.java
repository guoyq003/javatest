package com.jd.thread.demo.synchronizeddemo.demo01;

import com.jd.thread.demo.synchronizeddemo.demo01.Printer01;

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
