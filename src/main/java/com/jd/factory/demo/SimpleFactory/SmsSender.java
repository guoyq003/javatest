package com.jd.factory.demo.SimpleFactory;

public class SmsSender implements Sender {
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
