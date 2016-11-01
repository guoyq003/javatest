package com.jd.io.demo;

import java.io.*;

public class MainTest {
    public static void main(String[] args) throws Exception {
        String file = "E:" + File.separator + "test" + File.separator + "input.txt";
        String fileName1 = "E:\\test\\input.txt";
        StreamDemo streamDemo=new StreamDemo();
//        streamDemo.readFileTest1(file);
//        System.out.println("=======================");
        streamDemo.readFileTest4(file);
    }
}
