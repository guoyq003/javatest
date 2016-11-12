package com.jd.io.demo;

import java.io.*;

/**
 * Created by guoyq on 2016/10/31.
 */
public class StreamDemo {
    public void readFileTest1(String fileName){
        try {
            File file=new File(fileName);
            InputStream is=new FileInputStream(file);
            byte[] bytes=new byte[100];
            is.read(bytes);
            System.out.println("文件长度为："+file.length());
            is.close();
            System.out.println(new String(bytes,"UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFileTest2(String fileName){
        try {
            File file=new File(fileName);
            InputStream is=new FileInputStream(file);
            byte[] bytes=new byte[(int) file.length()];
            is.read(bytes);
            System.out.println("文件长度为："+file.length());
            is.close();
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFileTest3(String fileName){
        try {
            File file=new File(fileName);
            InputStream is=new FileInputStream(file);
            byte[] bytes=new byte[(int) file.length()];
            for (int i=0;i<bytes.length;i++){
                bytes[i]= (byte)is.read();
//                System.out.println("d:"+is.read());
            }
            is.close();
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFileTest4(String fileName) throws Exception{
        try {
            File file=new File(fileName);
            InputStream is=new FileInputStream(file);
            byte[] bytes=new byte[256];
            int count=0;
            int temp=0;
            while ((temp=is.read())!=(-1)){
                bytes[count++]=(byte)temp;
            }
            is.close();
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
