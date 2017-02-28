package com.jd.thread.demo.synchronizeddemo.demo01;

import com.jd.thread.demo.synchronizeddemo.demo01.Printer;

public class NumberThread extends Thread {
    private Printer printer;
    public NumberThread(Printer printer){
        this.printer = printer;
    }
    public void run(){
        for (int i=1;i<=52;i++){
            printer.printNum(i);
        }
    }
}
