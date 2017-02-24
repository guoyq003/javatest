package com.jd.thread.demo.synchronizeddemo;

/**
 * Created by guoyq on 2017/2/24.
 */
public class IceStreamDemo implements Runnable {
    private int iceStreamNum;
    public int bigEatIceNum=0;
    public int smallEatIceNum=0;
    public boolean flag=true;
    public IceStreamDemo(int iceStreamNum){
        this.iceStreamNum=iceStreamNum;
    }
    //吃冰激凌的方法
    public synchronized void eatIceStream() {
        if (iceStreamNum<=0){
            flag=false;
            return;
        }
        iceStreamNum--;
        if (Thread.currentThread().getName().equals("大狗")){
            bigEatIceNum++;
            System.out.println("大狗吃了一个冰激凌,还剩"+iceStreamNum+"个。");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            smallEatIceNum++;
            System.out.println("二狗吃了一个冰激凌,还剩"+iceStreamNum+"个。");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run() {
//        while (flag){
            eatIceStream();
//        }
    }
    //统计吃了多少个冰激凌
    public void showResult(){
        System.out.println("大狗吃了："+bigEatIceNum+"个。");
        System.out.println("二狗吃了："+smallEatIceNum+"个。");
    }
}
