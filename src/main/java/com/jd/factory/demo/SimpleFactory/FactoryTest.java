package com.jd.factory.demo.SimpleFactory;

public class FactoryTest {
    public static void main(String[] args) {
        //普通工厂方法
        SendFactory sendFactory=new SendFactory();
//        Sender sender=sendFactory.produce("sms");
//        sender.Send();
        //多个工厂方法
//        Sender sender=sendFactory.produceMail();
//        sender.Send();
        //静态工厂方法模式
        Sender sender=SendFactory.produceMail();
        sender.Send();
    }
}
