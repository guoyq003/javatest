package com.jd.poi.demo;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;
import com.sun.prism.paint.Gradient;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;


public class MainTest {

    public static void main(String[] args) throws Exception {
        String excelFile="E:\\test\\input.txt";
        FileInputStream fis=new FileInputStream(excelFile);
        byte[] bytes= new byte[30];
        fis.read(bytes);
        String string=new String(bytes,"UTF-8");
        System.out.println(string);
    }

}
