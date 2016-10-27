package com.jd.poi.demo;

import com.sun.prism.paint.Gradient;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class MainTest {

    public static void main(String[] args) throws Exception {
        String excelFile="E:\\test\\excelTest1.xls";
        ReadExcelDemo readExcelDemo=new ReadExcelDemo();
        readExcelDemo.vieWExcel(excelFile);
    }

}
