package com.jd.json.demo;

import java.util.Date;

/**
 * Created by guoyiqing1 on 2016/5/31.
 */
public class DateBean {
    private String id;
    private String name;
    private int age;
    private Date date;

    public DateBean(String id, String name, int age, Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DateBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
