package com.jd.singleton.demo;

//懒汉模式
public class Singleton {
    //两种模式，一种线程安全的，一种线程非安全的
//    private static  Singleton instance=null;
//    public static synchronized Singleton getInstance(){
//        if (null==instance){
//            instance=new Singleton();
//        }
//        return instance;
//    }

    private static final Singleton instance=new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
    public int add(int a,int b){
        return a + b;
    }
}
