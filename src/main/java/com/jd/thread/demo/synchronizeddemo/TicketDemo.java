package com.jd.thread.demo.synchronizeddemo;

import sun.plugin.WJcovUtil;

public class TicketDemo implements Runnable {
    private int ticketNum;
    private boolean flag=true;
    public TicketDemo(int ticketNum){
        this.ticketNum=ticketNum;
    }

    public synchronized void tickSale(){
        synchronized (this){
            if (ticketNum<=0){
                flag=false;
                return;
            }
            try {
                Thread.sleep(100);
                ticketNum--;
                System.out.println(Thread.currentThread().getName()+"售出一张票"+";"+"还剩"+ticketNum+"张");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run() {
        while (flag){
            tickSale();
        }
    }
}
