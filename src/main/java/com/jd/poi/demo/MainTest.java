package com.jd.poi.demo;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;

public class MainTest {

    public static void main(String[] args) {
        String fileName="E:/test/firstExcel.xls";
        ReadExcelDemo.readExcel(fileName);
    }
}
