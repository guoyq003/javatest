package com.jd.poi.demo;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class ReadExcelDemo {
    public static void readExcel(String fileName){
        boolean isE2007=false;
        if (fileName.endsWith("xlsx")){
            isE2007=true;
        }
        try {
            InputStream input=new FileInputStream(fileName);
            Workbook wb=null;
            //根据文件格式(2003或者2007)来初始化
            if (isE2007){
                wb=new XSSFWorkbook(input);
            }else {
                wb=new HSSFWorkbook(input);
            }
            Sheet sheet=wb.getSheetAt(0);//获得第一个sheet
            Iterator<Row> rows=sheet.rowIterator();
            while (rows.hasNext()){
                Row row=rows.next();//行数据
//                System.out.print("Row #" + row.getRowNum());
                Iterator<Cell> cells=row.cellIterator();//获得第一行迭代器
                while (cells.hasNext()){
                    Cell cell=cells.next();
//                    System.out.println("Cell #" + cell.getColumnIndex());
                    System.out.print(cell+"\t");
//                    switch (cell.getCellType()){
//                        case HSSFCell.CELL_TYPE_NUMERIC:
//                            System.out.println(cell.getNumericCellValue());
//                        case HSSFCell.CELL_TYPE_STRING:
//                            System.out.println(cell.getStringCellValue());
//                            break;
//                        case HSSFCell.CELL_TYPE_BOOLEAN:
//                            System.out.println(cell.getBooleanCellValue());
//                            break;
//                        case HSSFCell.CELL_TYPE_FORMULA:
//                            System.out.println(cell.getCellFormula());
//                            break;
//                        default:
//                            System.out.println("unsuported sell type");
//                        break;
//                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
