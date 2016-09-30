package com.jd.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyiqing1 on 2016/6/3.
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
/*        Car car= (Car) context.getBean("car1");
        System.out.println(car);*/
        Car car= (Car) context.getBean("car2");
        System.out.println(car);
        Car car1= (Car) context.getBean("car3");
        System.out.println(car1);
        Person person= (Person) context.getBean("person1");
        System.out.println(person);
        Person person2= (Person) context.getBean("person2");
        System.out.println(person2);
        PersonList personList= (PersonList) context.getBean("personList");
        System.out.println(personList);
        PersonMap personMap= (PersonMap) context.getBean("personMap");
        System.out.println(personMap);
    }
}
