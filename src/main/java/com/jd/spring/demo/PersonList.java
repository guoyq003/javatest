package com.jd.spring.demo;

import java.util.List;

/**
 * Created by guoyiqing1 on 2016/6/3.
 */
public class PersonList  {
    private String name;
    private int age;
    private char sex;

    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

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
    @Override
    public String toString() {
        return "PersonList{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", cars=" + cars +
                '}';
    }
}
