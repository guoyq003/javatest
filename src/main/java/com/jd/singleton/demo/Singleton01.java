package com.jd.singleton.demo;

//懒汉模式
public class Singleton01 {
    //线程不安全的
    private static final Singleton01 instance=new Singleton01();
    private Singleton01(){}
    public static Singleton01 getInstance(){
        return instance;
    }
    public int add(int a,int b){
        return a + b;
    }
}
