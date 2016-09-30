package com.jd.proxy.demo.ProxyTest;

public class Agent implements IMoveStar {

    private Star star;

    public Agent(Star star) {
        this.star = star;
    }

    public void movieShow(int money) {
        if (money<10000){
            System.out.println(money+"块钱？,你雇SB去演吧！");
            return;
        }
        star.movieShow(money);
    }
}
