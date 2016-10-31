package com.jd.io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by guoyq on 2016/10/31.
 */
public class StreamDemo {
    public void readFileTest(String fileName){
        FileInputStream fis=null;
        try {
            fis=new FileInputStream(fileName);
            byte[] arr=new byte[50];
            int len=fis.read(arr);
            String data=new String(arr,0,len);
            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
