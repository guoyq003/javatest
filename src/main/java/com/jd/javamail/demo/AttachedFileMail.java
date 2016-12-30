package com.jd.javamail.demo;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Properties;

public class AttachedFileMail {
    public static void main(String[] args) throws MessagingException {
        JavaMailSenderImpl senderImpl=new JavaMailSenderImpl();
        senderImpl.setHost("smtp.163.com");
        MimeMessage mailMessage=senderImpl.createMimeMessage();
        MimeMessageHelper messageHelper=new MimeMessageHelper(mailMessage,true,"utf-8");
        messageHelper.setTo("65698173@qq.com");
        messageHelper.setFrom("xbniao_tian@163.com");
        messageHelper.setSubject("测试邮件中上传附件!！");
        messageHelper.setText("<html><head></head><body><h1>你好：附件中有学习资料！</h1></body></html>",true);
        FileSystemResource file=new FileSystemResource(new File("E:\\javatest\\img\\test.jpg"));
        messageHelper.addAttachment("test.jpg",file);
        senderImpl.setUsername("xbniao_tian");
        senderImpl.setPassword("12");
        Properties prop=new Properties();
        prop.put("mail.smtp.auth", "true") ;
        prop.put("mail.smtp.timeout", "25000") ;
        senderImpl.setJavaMailProperties(prop);
        senderImpl.send(mailMessage);
        System.out.println("邮件发送成功..");
    }

}
