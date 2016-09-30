package com.jd.proxy.demo.ProxyTest;

public class Star implements IMoveStar {
    private String starName;

    public Star(String starName) {
        this.starName = starName;
    }

    public void movieShow(int money) {
        System.out.println(starName+"出演了片酬为："+money+"的电影!");
    }

}
