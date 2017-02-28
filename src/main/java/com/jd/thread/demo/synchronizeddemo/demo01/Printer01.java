package com.jd.thread.demo.synchronizeddemo.demo01;

public class Printer01 {
    private boolean flag=true;//信号量，控制输出
    public synchronized void printNum(int num){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(num);
        if (num % 2 == 0){
            flag=false;
            notify();
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void printChar(char c){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(c);
        flag=true;
        notify();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
