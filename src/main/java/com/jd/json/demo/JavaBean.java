package com.jd.json.demo;

/**
 * Created by guoyiqing1 on 2016/5/31.
 */
public class JavaBean {
    private String id;
    private String name;
    private int age;
    private String addr;
    @Override
    public String toString() {
        return "JavaBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
    public JavaBean (String id,String name,int age,String addr){
        this.id=id;
        this.name=name;
        this.age=age;
        this.addr=addr;
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
