package com.jd.thread.demo.synchronizeddemo.demo01;

public class Printer {
    /**
     * 1.写两个线程，一个线程打印 1~52，另一个线程打印字母A-Z打印顺序为12A34B56C……5152Z（2个数字1个字母）。
     提示：使用线程间的通信。
     */
    private boolean numOut=false;//信号量，记录数字是否已经输出
    public synchronized void printNum(int num){
        if (numOut){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(num);//输出数字
        //如果刚刚输出的数字是偶数的话，就唤醒字母输出线程
        if(num % 2 == 0){
            numOut =true;//标记已经输出数字
            notify();//唤醒字母输出线程去输出字母
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void printLetter(char c){
        if (!numOut){//如果还没有输出数字，就等待数字输出
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(c);//输出字母
        numOut = false;
        notify();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
