package com.jd.map.demo;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

/**
 * Created by guoyiqing1 on 2016/5/27.
 */
public class SetDemo {
    public static void main(String[] args) {
        int array[]={1,3,0,9,7,8,3,5,3,1,0};
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n");
        int temp[]=removeRepeat(array);
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
    public static int[] removeRepeat(int[] array){
        HashSet<Integer> sets=new HashSet<Integer>();
        for (int i=0;i<array.length;i++){
            sets.add(array[i]);
        }
        int newArray[]=new int[sets.size()];
        Iterator<Integer> iterator=sets.iterator();
        for (int i=0;iterator.hasNext();i++){
            newArray[i]=iterator.next();
        }
        return newArray;
    }
}
