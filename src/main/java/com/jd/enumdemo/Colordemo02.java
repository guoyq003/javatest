package com.jd.enumdemo;

public enum  Colordemo02 {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);
    private String name;
    private int index;
    Colordemo02(String name,int index){
        this.name=name;
        this.index=index;
    }

    @Override
    public String toString() {
        return this.index+"_"+this.name;
    }
}
