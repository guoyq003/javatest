package com.jd.thread.demo.synchronizeddemo.demo03;

public class Consumer extends Thread {
    private int consumeNum;                //消费产品的数量
    private Godown godown;            //仓库

   public Consumer(int consumeNum, Godown godown) {
        this.consumeNum = consumeNum;
        this.godown = godown;
    }

    public void run() {
        //消费指定数量的产品
        godown.consume(consumeNum);
    }
}
