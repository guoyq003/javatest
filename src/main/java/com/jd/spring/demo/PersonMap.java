package com.jd.spring.demo;

import java.util.Map;

/**
 * Created by guoyiqing1 on 2016/6/3.
 */
public class PersonMap {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    private char sex;
    private Map<String,Car> carMap;

    @Override
    public String toString() {
        return "PersonMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", carMap=" + carMap +
                '}';
    }

}
