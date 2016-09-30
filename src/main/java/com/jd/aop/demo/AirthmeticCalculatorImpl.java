package com.jd.aop.demo;

import org.springframework.stereotype.Component;

@Component
public class AirthmeticCalculatorImpl implements AirthmeticCalculator{

    public int add(int i, int j) {
        int result=i + j;
        return result;
    }

    public int sub(int i, int j) {
        int result=i - j;
        return result;
    }

    public int div(int i, int y) {
        int result=i / y;
        return result;
    }
}
