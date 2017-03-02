package com.jd.algorithm.demo;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={9,3,2,1,10,7,100,57};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
//        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
