package com.jd.javamail.demo;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class HTMLMailDemo {
    public static void main(String[] args) throws MessagingException {
        JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
        mailSender.setHost("smtp.163.com");
        MimeMessage mailMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);
        //设置收件人，寄件人
        messageHelper.setTo("65698173@qq.com");
        messageHelper.setFrom("xbniao_tian@163.com");
        messageHelper.setSubject("HTML测试");
        //true 表示启动HTML格式的邮件
        messageHelper.setText("<html><head></head><body><h1>hello!!spring html Mail</h1></body></html>",true);
        mailSender.setUsername("xbniao_tian");
        mailSender.setPassword("12");
        Properties prop=new Properties();
        prop.put("mail.smtp.auth", "true") ;
        mailSender.setJavaMailProperties(prop);
        mailSender.send(mailMessage);
        System.out.println("邮件发送成功!");

    }
}
