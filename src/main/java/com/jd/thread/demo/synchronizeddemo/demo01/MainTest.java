package com.jd.thread.demo.synchronizeddemo.demo01;

public class MainTest {
    public static void main(String[] args) {
//        Printer printer=new Printer();
//        new LetterThread(printer).start();
//        new NumberThread(printer).start();
        Printer01 printer01=new Printer01();
        LetterRunnable th1=new LetterRunnable(printer01);
        NumberRunnable th2=new NumberRunnable(printer01);
        new Thread(th1).start();
        new Thread(th2).start();
    }
}
