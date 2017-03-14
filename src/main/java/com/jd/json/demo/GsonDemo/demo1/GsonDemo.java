package com.jd.json.demo.GsonDemo.demo1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.jd.json.demo.GsonDemo.demo2.JavaBean;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by guoyiqing1 on 2016/5/31.
 */
public class GsonDemo {
    public static void main(String[] args) {
        Gson gson=new Gson();
        JavaBean javaBean=new JavaBean("1001","sctoo",20,"TL");
        /**
         * javabean 转换成json字符串
         */
        //bean>json
        String json=gson.toJson(javaBean);
        System.out.println("bean转换后的json为："+json);
        //json>bean
        javaBean=gson.fromJson(json,JavaBean.class);
        System.out.println("json转换后的bean为："+javaBean);
        System.out.println("------------------------------------------");
        /**
         *  List转换成Json字符串
         */
        List list=new ArrayList();
        for (int i=0;i<5;i++){
            list.add("element"+i);
        }
        String listJson=gson.toJson(list);
        System.out.println(listJson);
        System.out.println("------------------------------------------");
        /**
         * 泛型List、Json相互转换
         */
        List<JavaBean> list1=new ArrayList<JavaBean>();
        for (int i=0;i<3;i++){
            JavaBean user=new JavaBean("100"+i,"name"+i,20+i,"bj"+i);
            list1.add(user);
        }
        // 泛型List -> Json
        Type type=new TypeToken<List<JavaBean>>(){}.getType();
        String json2=gson.toJson(list1,type);
        System.out.println("list转json为："+json2);
        System.out.println("------------------------------------------");
        /**
         * Map转换成Json字符串
         */
        Map<Object,Object> map=new HashMap<Object, Object>();
        map.put("id","1001");
        map.put("name","json");
        map.put("age",23);
        map.put("addr","bj");
        //map>json
        String json3=gson.toJson(map);
        System.out.println(json3);
        System.out.println("------------------------------------------");
        //泛型Map、Json相互转换
        Map<String,JavaBean> map1=new HashMap<String, JavaBean>();
        for (int i=0;i<5;i++){
            JavaBean javaBean1=new JavaBean("200"+i,"jdon"+i,30+i,"nj"+i);
            map1.put("1001"+i,javaBean1);
        }
        System.out.println(map1);
        // 泛型Map -> Json
        Type type1=new TypeToken<Map<String,JavaBean>>(){}.getType();
        String json4=gson.toJson(map1,type1);
        System.out.println(json4);
        Map<String, JavaBean> users2 = gson.fromJson(json4.toString(), type1);
        System.out.println(users2);
        //Json -> Map
        Map<String, JavaBean> users3 = gson.fromJson(json4.toString(), type1);
        System.out.println(users3);
    }
}
