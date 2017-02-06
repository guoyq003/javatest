package com.jd.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car1= (Car) context.getBean("car1");
//        Car car2= (Car) context.getBean("car2");
        System.out.println("car1是:"+car1);
//        System.out.println("car2是:"+car2);
        Person person3= (Person) context.getBean("person3");
        Person person4= (Person) context.getBean("person4");
        Person person5= (Person) context.getBean("person5");
        Person person6= (Person) context.getBean("person6");
        Person person7= (Person) context.getBean("person7");
        System.out.println("person3:"+person3);
        System.out.println("person4:"+person4);
        System.out.println("person5:"+person5);
        System.out.println("person6:"+person6);
        System.out.println("person7:"+person7);
    }
}
