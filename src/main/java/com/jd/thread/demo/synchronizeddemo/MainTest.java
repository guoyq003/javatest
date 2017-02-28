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
//        Printer01 printer01=new Printer01();
//        LetterRunnable th1=new LetterRunnable(printer01);
//        NumberRunnable th2=new NumberRunnable(printer01);
//        new Thread(th1).start();
//        new Thread(th2).start();
        // 仓库对象
        Storage storage = new Storage();

        // 生产者对象
        Producer p1 = new Producer(storage);
        Producer p2 = new Producer(storage);
        Producer p3 = new Producer(storage);
        Producer p4 = new Producer(storage);
        Producer p5 = new Producer(storage);
        Producer p6 = new Producer(storage);
        Producer p7 = new Producer(storage);

        // 消费者对象
        Consumer c1 = new Consumer(storage);
        Consumer c2 = new Consumer(storage);
        Consumer c3 = new Consumer(storage);

        // 设置生产者产品生产数量
        p1.setNum(10);
        p2.setNum(10);
        p3.setNum(10);
        p4.setNum(10);
        p5.setNum(10);
        p6.setNum(10);
        p7.setNum(80);

        // 设置消费者产品消费数量
        c1.setNum(50);
        c2.setNum(20);
        c3.setNum(30);

        // 线程开始执行
        c1.start();
        c2.start();
        c3.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
    }
}
