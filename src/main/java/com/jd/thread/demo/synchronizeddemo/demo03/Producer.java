package com.jd.thread.demo.synchronizeddemo.demo03;

public class Producer extends Thread {
    private Godown godown;
    private int produceNum;//生产数量
    public Producer(int produceNum,Godown godown){
        this.produceNum=produceNum;
        this.godown=godown;
    }
    public void run(){
        godown.produce(produceNum);
    }
}
