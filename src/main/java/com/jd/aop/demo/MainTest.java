package com.jd.aop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
//        //使用aop切点
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        AirthmeticCalculator airthmeticCalculator=context.getBean(AirthmeticCalculator.class);
//        int result=airthmeticCalculator.add(3,7);
//        System.out.println(result);
//        int result1=airthmeticCalculator.add(10,2);
//        System.out.println(result1);
        AirthmeticCalculator target=new AirthmeticCalculatorImpl();
        AirthmeticCalculator proxy=new AirthmeticCalculatorLoggingProxy(target).getLoggingProxy();
        int result=proxy.add(2,8);
        System.out.println(result);
        
    }
}
