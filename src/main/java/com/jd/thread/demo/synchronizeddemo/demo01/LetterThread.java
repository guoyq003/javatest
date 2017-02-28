package com.jd.thread.demo.synchronizeddemo.demo01;

import com.jd.thread.demo.synchronizeddemo.demo01.Printer;

public class LetterThread extends Thread {
    private Printer printer;
    public LetterThread(Printer printer){
        this.printer = printer;
    }
    public void run(){
        for(char c='A';c<='Z';c++){
            printer.printLetter(c);
        }
    }
}
