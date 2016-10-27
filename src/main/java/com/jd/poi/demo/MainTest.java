package com.jd.poi.demo;

import com.sun.prism.paint.Gradient;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class MainTest {

    public static void main(String[] args) throws IOException {
        Workbook wb=new HSSFWorkbook(); // 定义一个新的工作簿
        Sheet sheet=wb.createSheet("sheet1");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue(20001);

        //样式
        CreationHelper creationHelper=wb.getCreationHelper();
        CellStyle cellStyle=wb.createCellStyle();
        //格式化时间格式
        cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd HH-mm:ss"));
        cell=row.createCell(1);
        cell.setCellValue(new Date());
        cell.setCellStyle(cellStyle);

        cell=row.createCell(2);
        cell.setCellValue(Calendar.getInstance());
        cell.setCellStyle(cellStyle);

        row.createCell(3).setCellValue(HSSFCell.CELL_TYPE_STRING);
        row.createCell(4).setCellValue(true);
        row.createCell(5).setCellValue(HSSFCell.CELL_TYPE_NUMERIC);
        row.createCell(6).setCellValue(HSSFCell.CELL_TYPE_BOOLEAN);
        row.createCell(7).setCellValue("字符串");
        row=sheet.createRow(1);
        row.createCell(0).setCellValue(20002);
        row.createCell(1).setCellValue("张伟");
        FileOutputStream fileOut=new FileOutputStream("E:\\test\\excelTest1.xls");
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();
    }

}
