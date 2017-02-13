package com.jd.proxy.demo.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
    //被代理的对象
    private Object mTarget;

    public ProxyHandler(Object mTarget) {
        this.mTarget = mTarget;
    }
    /**
     * 方法拦截，可以进行一些额外操作
     * @param proxy
     * @param method 拦截的方法
     * @param args 方法对应的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName=method.getName();
        if (methodName.equals("movieShow")){
            if (args[0] instanceof Integer && ((Integer) args[0]) < 300) {
                System.out.println(args[0] + "块钱？！你雇SB演去吧");
                return null;
            }
        }
        Object result=method.invoke(mTarget,args);
        return result;
    }
    /**
     * 获取代理
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(mTarget.getClass().getClassLoader(), mTarget.getClass().getInterfaces(),this);
    }
}
