package com.jd.aop.demo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class AirthmeticCalculatorLoggingProxy {

    //要代理的对象
    private Object mTarget;

    public AirthmeticCalculatorLoggingProxy(AirthmeticCalculator mTarget) {
        this.mTarget = mTarget;
    }
    public AirthmeticCalculator getLoggingProxy(){
        AirthmeticCalculator proxy=null;
        //代理对象由哪个类加载器加载
        ClassLoader loader=mTarget.getClass().getClassLoader();
        //代理对象的类型，既其中有哪些方法
        Class[] interfaces=new Class[]{AirthmeticCalculator.class};
        InvocationHandler h=new InvocationHandler() {
            //
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName=method.getName();
                //执行前打印
                System.out.println("proxyModle：The method  "+methodName+" begins with "+ Arrays.asList(args));
                Object result=method.invoke(mTarget,args);
                //执行后通知
                System.out.println("proxyModle：The method "+methodName+" ends with "+result);
                return result;
            }
        };
        proxy= (AirthmeticCalculator) Proxy.newProxyInstance(loader,interfaces,h);
        return proxy;
    }
}
