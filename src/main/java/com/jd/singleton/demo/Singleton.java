package com.jd.singleton.demo;

//懒汉模式
public class Singleton {
    private static  Singleton instance=null;
    public static synchronized Singleton getInstance(){
        if (null==instance){
            instance=new Singleton();
        }
        return instance;
    }
    public int add(int a,int b){
        return a + b;
    }
}
