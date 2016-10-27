package com.jd.poi.demo;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;

public class CreateExcelDemo {

    public void createExcel(){
        try{
            HSSFWorkbook workbook=new HSSFWorkbook();
            HSSFSheet sheet=workbook.createSheet("test1");
            HSSFRow row=sheet.createRow(1);
            HSSFCell cell=row.createCell(2);
            cell.setCellValue("数学");
            FileOutputStream os=null;
            os=new FileOutputStream("E:\\test\\test.xls");
            workbook.write(os);
            os.flush();
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("ok");
    }
}
