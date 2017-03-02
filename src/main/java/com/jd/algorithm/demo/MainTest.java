package com.jd.algorithm.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MainTest {
    public static void main(String[] args) {
        int a=1234;
//        do {
//            System.out.print(a%10);
//            a=a/10;
//            if (a==0)break;
//        }while (true);
//        StringBuffer sb=new StringBuffer(String.valueOf(a));
//        System.out.println(sb.reverse());
//       for (int i=100;i<=999;i++){
//           int baiwei=i/100%10;
//           int shiwei=i/10%10;
//           int gewei=i%10;
//           if (i==(int) Math.pow(baiwei,3)+(int) Math.pow(shiwei,3)+(int) Math.pow(gewei,3)){
//               System.out.println(i);
//           }
//       }
//        String str1="def2";
//        String str2="abcdef234";
//        if (str2.indexOf(str1)!=-1){
//            System.out.println("字符串包含");
//        }else {
//            System.out.println("字符串不包含");
//        }
        String str="19ab7u80mk3";
        List<Integer> integerList=new ArrayList<Integer>();
        List<Character> characters=new ArrayList<Character>();
        for (int i=0;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                integerList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }else {
                characters.add(str.charAt(i));
            }
        }
        for (int i=0;i<integerList.size();i++){
            System.out.print(integerList.get(i)+"\t");
        }
        System.out.println();
        Collections.sort(integerList);
        for (int i=0;i<integerList.size();i++){
            System.out.print(integerList.get(i)+"\t");
        }
    }
}
