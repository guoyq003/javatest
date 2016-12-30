package com.jd.io.demo;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) throws Exception {
        String file = "E:" + File.separator + "test" + File.separator + "input.txt";
        String fileName1 = "E:\\test\\test1";
        String msg="大笨蛋的！";
        List<String> contents=new ArrayList<String>();
        contents.add("中华人民共和国");
        contents.add("还是可以的");
        contents.add("你是个bitchs");
        StreamDemo streamDemo=new StreamDemo();
//        streamDemo.readFileTest1(file);
//        System.out.println("=======================");
//        streamDemo.readFileTest4(file);
//        System.out.println(CommonsIoDemo.getContentFromFile(file));
        CommonsIoDemo.addContent(file,contents);

    }

}
