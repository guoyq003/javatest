package com.jd.thread.demo.synchronizeddemo.demo03;

public class Godown {
    private static final int MAX_NUM=100;//最大的库存量
    private int curnum;//当前库存量
    public Godown(){}
    public Godown(int curnum){
        this.curnum=curnum;
    }
    //生产者方法
    public synchronized void produce(int produceNum){
        while (produceNum + curnum >MAX_NUM){
            System.out.println("要生产的产品数量:" + produceNum + " 超过需要补充的库存量:" + (MAX_NUM - curnum) + "，" +
                    "暂时不能执行生产任务!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        curnum+=produceNum;
        System.out.println("已经生产了" + produceNum + "个产品，现仓储量为" + curnum);
        notifyAll();
    }
    //消费者方法
    public synchronized void consume(int consumeNum) {
        while (consumeNum>curnum){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        curnum-=consumeNum;
        System.out.println("已经消费了" + consumeNum + "个产品，现仓储量为" + curnum);
        notifyAll();
    }
}
