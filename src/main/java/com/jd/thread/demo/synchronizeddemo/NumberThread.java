package com.jd.thread.demo.synchronizeddemo;

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
