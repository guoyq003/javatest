package com.jd.thread.demo.synchronizeddemo;

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
