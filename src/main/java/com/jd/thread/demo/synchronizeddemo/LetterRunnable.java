package com.jd.thread.demo.synchronizeddemo;

public class LetterRunnable implements Runnable {
    private Printer01 printer01;
    public LetterRunnable(Printer01 printer01){
        this.printer01 = printer01;
    }
    public void run(){
        for(char c='A';c<='Z';c++){
            printer01.printChar(c);
        }
    }
}
