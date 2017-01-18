package com.jd.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Car car1= (Car) context.getBean("car1");
//        Car car2= (Car) context.getBean("car2");
//        System.out.println("car1是:"+car1);
//        System.out.println("car2是:"+car2);
        Person person= (Person) context.getBean("person3");
        System.out.println(person);
    }
}
