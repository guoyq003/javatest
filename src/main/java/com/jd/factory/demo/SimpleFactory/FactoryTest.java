package com.jd.factory.demo.SimpleFactory;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory=new SendFactory();
        Sender sender=sendFactory.produce("sms");
        sender.Send();
    }
}
