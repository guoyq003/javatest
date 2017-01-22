package com.jd.factory.demo.SimpleFactory;

public class SendFactory {
//    //普通工厂方法
//    public Sender produce(String type){
//        if ("mail".equals(type)){
//            return new MailSender();
//        }else if ("sms".equals(type)){
//            return new SmsSender();
//        }else {
//            System.out.println("请输入正确的类型！");
//            return null;
//        }
//    }
    //多个工厂方法
//    public  Sender produceMail(){
//        return new MailSender();
//    }
//    public Sender produceSma(){
//        return new SmsSender();
//    }
    //静态工厂方法模式
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSma(){
        return new SmsSender();
    }
}
