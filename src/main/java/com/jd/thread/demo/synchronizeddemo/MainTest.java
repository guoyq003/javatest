package com.jd.thread.demo.synchronizeddemo;

/**
 * Created by guoyq on 2017/2/24.
 */
public class MainTest {
    public static void main(String[] args) {
//        IceStreamDemo iceStreamDemo=new IceStreamDemo(10);
//        Thread thread1=new Thread(iceStreamDemo,"大狗");
//        Thread thread2=new Thread(iceStreamDemo,"二狗");
//        thread1.start();
//        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//            iceStreamDemo.showResult();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        TicketDemo ticketDemo=new TicketDemo(10);
//        Thread thread1=new Thread(ticketDemo,"窗口1");
//        Thread thread2=new Thread(ticketDemo,"窗口2");
//        thread1.start();
//        thread2.start();
//        AccountDemo accountDemo=new AccountDemo();
//        Thread thread1=new Thread(accountDemo,"大张");
//        Thread thread2=new Thread(accountDemo,"小张");
//        thread1.start();
//        thread2.start();
//        new TrainDemo("火车1号").start();
//        new TrainDemo("火车2号").start();
//        new TrainDemo("火车3号").start();
//        new TrainDemo("火车4号").start();
//        new TrainDemo("火车5号").start();
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
