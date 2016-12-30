package com.jd.enumdemo;

import java.awt.*;

public enum  Colordemo01 {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);
    private String name;
    private int index;

    Colordemo01(String name, int index) {
        this.name = name;
        this.index = index;
    }
    //普通方法
    public static String getName(int index){
        for (Colordemo01 c:Colordemo01.values()){
            if (c.getIndex()==index){
                return c.name;
            }
        }return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}


