package com.jd.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//特点：有序的、线性的、无固定大小的、有下标的、先进先出
public class ListTest {
    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        for(int i=0;i<3;i++){
            String s="元素"+i;
            list.add(s);
        }
        list.add("abc");
        list.add("abc");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------------");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------");
        for (String str:list){
            System.out.println(str);
        }
    }
}
