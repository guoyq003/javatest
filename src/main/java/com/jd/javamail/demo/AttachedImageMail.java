package com.jd.javamail.demo;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Properties;

public class AttachedImageMail {
    public static void main(String[] args) throws MessagingException {
        JavaMailSenderImpl javaMailSender=new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.163.com");
        MimeMessage mailMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true);
//        messageHelper.setTo("65698173@qq.com");
        messageHelper.setTo("13718907836@163.com");
        messageHelper.setFrom("xbniao_tian@163.com");
        messageHelper.setSubject("测试邮件中嵌套图片!！");
        messageHelper.setText("<html><head></head><body><h3>hello!!spring image html mail</h3>" + "<img src=\"cid:aaa\"/></body></html>",true);
        FileSystemResource img = new FileSystemResource(new File("E:\\javatest\\img\\Pie3DChart.jpg"));
        messageHelper.addInline("aaa",img);
        javaMailSender.setUsername("xbniao_tian");
        javaMailSender.setPassword("12");
        Properties prop=new Properties();
        prop.put("mail.smtp.auth", "true") ;
        javaMailSender.setJavaMailProperties(prop);
        javaMailSender.send(mailMessage);
        System.out.println("邮件发送成功!");

    }
}
