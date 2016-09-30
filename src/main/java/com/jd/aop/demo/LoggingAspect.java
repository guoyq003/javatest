package com.jd.aop.demo;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//声明一个切面：需要把该类放入到IOC容器中、在声明一个切面
@Aspect
@Component
public class LoggingAspect{

    @Before("execution(* com.jd.aop.demo.*.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName=joinPoint.getSignature().getName();
        List<Object> args= Arrays.asList(joinPoint.getArgs());
        System.out.println("The method "+methodName+" begins with" +args);
    }
//    @After("execution(* com.jd.aop.demo.*.*(..))")
//    public void afterMethod(JoinPoint joinPoint){
//        String methodName=joinPoint.getSignature().getName();
//        System.out.println("The method"+methodName+" end");
//    }
}
