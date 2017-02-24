package com.jd.spring.demo.annotation;

import com.jd.spring.demo.annotation.controller.UserController;
import com.jd.spring.demo.annotation.respository.UserRespository;
import com.jd.spring.demo.annotation.service.UserService;
import org.apache.bcel.generic.IF_ACMPEQ;
import org.apache.xpath.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-annotation.xml");
//        TestObject testObject= (TestObject) ctx.getBean("testObject");
//        System.out.println(testObject);
        UserController userController= (UserController) ctx.getBean("userController");
//        System.out.println(userController);
        userController.execute();
//        UserService userService= (UserService) ctx.getBean("userService");
//        System.out.println(userService);
//        UserRespository userRespository= (UserRespository) ctx.getBean("userRespository");
//        System.out.println(userRespository);
        String str="start";
        StringBuilder str1=new StringBuilder("abend");
        for (int i=0;i<10;i++){
            str = str + "hello";
            str1.append("hello");
        }
        System.out.println(str);
        System.out.println(str1);
    }

}
