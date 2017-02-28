package com.jd.thread.demo.synchronizeddemo;

public class AccountDemo implements Runnable {
    private int money=0;
    public synchronized void saveMoney(int money){
        this.money+=money;
        System.out.println(Thread.currentThread().getName()+"存入100元，账户余额为"+this.money);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void run() {
        for (int i=0;i<10;i++){
            saveMoney(100);
        }
    }
}
