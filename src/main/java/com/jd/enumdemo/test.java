package com.jd.enumdemo;

public class test {
    public static void main(String[] args) {
        for (Colordemo01 c:Colordemo01.values()){
            System.out.println(c.getIndex()+":"+c.getName());
        }
    }
}
