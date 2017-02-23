package com.jd.aop.demo;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//声明一个切面：需要把该类放入到IOC容器中、在声明一个切面
@Aspect
@Component
public class LoggingAspect{

    /**
     * 前置通知*/
    @Before("execution(* com.jd.aop.demo.*.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName=joinPoint.getSignature().getName();
        List<Object> args= Arrays.asList(joinPoint.getArgs());
        System.out.println("The method "+methodName+" begins with" +args);
    }

    /**
     * 后置通知
     * @param joinPoint
     */
    @After("execution(* com.jd.aop.demo.*.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("The method "+methodName+" end");
    }

    /**
     * 返回通知,出现异常的情况下不会执行返回通知，但是会执行后置通知
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "execution(* com.jd.aop.demo.*.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("The method "+methodName+" end with " +result);
    }
    /**
     * 异常通知,在目标方法出现异常时执行该通知
     */
    @AfterThrowing(value = "execution(* com.jd.aop.demo.*.*(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,ArithmeticException ex){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("The method "+methodName+" occurs excetion: " +ex);
    }
}
