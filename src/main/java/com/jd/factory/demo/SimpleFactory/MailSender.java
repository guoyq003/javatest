package com.jd.factory.demo.SimpleFactory;

public class MailSender implements Sender {
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
