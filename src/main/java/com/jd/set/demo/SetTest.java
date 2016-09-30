package com.jd.set.demo;

import java.util.HashSet;
import java.util.Iterator;

//特点：无序的，长度可变的，不可重复的
public class SetTest {
    public static void main(String[] args) {
        HashSet<String> stringHashSet=new HashSet<String>();
        for (int i=0;i<3;i++){
            String s = "元素a" + i;
            stringHashSet.add(s);
        }
        stringHashSet.add("abc");
        stringHashSet.add("abc");
        Iterator<String> iterator=stringHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------");
        for (String str:stringHashSet){
            System.out.println(str);
        }
    }
}
