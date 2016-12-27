package com.jd.javamail.demo;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class SingleMailSend {
    public static void main(String[] args) {
        JavaMailSenderImpl senderImpl=new JavaMailSenderImpl();
        //设定mail server
        senderImpl.setHost("smtp.163.com");
        // 建立邮件消息
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        // 设置收件人，寄件人 用数组发送多个邮件
        // String[] array = new String[]    {"sun111@163.com","sun222@sohu.com"};
        // mailMessage.setTo(array);
        mailMessage.setTo("65698173@qq.com");
        mailMessage.setFrom("xbniao_tian@163.com");
        mailMessage.setSubject("简单邮件发送");
        mailMessage.setText("邮件正文");
        senderImpl.setUsername("xbniao_tian");
        senderImpl.setPassword("12");
        Properties prop  =   new Properties();
        prop.put("mail.smtp.auth" ,  " true");//  将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
        prop.put( " mail.smtp.timeout " ,  " 25000 " );
        senderImpl.setJavaMailProperties(prop);
        senderImpl.send(mailMessage);
        System.out.println("邮件发送成功!");
    }
}
