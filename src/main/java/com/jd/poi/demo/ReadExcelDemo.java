package com.jd.poi.demo;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import org.apache.poi.hssf.extractor.ExcelExtractor;
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
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public class ReadExcelDemo {

    public static void readExcel(String fileName) {
        boolean isE2007 = false;
        if (fileName.endsWith("xlsx")) {
            isE2007 = true;
        }
        try {
            InputStream input = new FileInputStream(fileName);
            Workbook wb = null;
            //根据文件格式(2003或者2007)来初始化
            if (isE2007) {
                wb = new XSSFWorkbook(input);
            } else {
                wb = new HSSFWorkbook(input);
            }
            Sheet sheet = wb.getSheetAt(0);//获得第一个sheet
            Iterator<Row> rows = sheet.rowIterator();
            while (rows.hasNext()) {
                Row row = rows.next();//行数据
//                System.out.print("Row #" + row.getRowNum());
                Iterator<Cell> cells = row.cellIterator();//获得第一行迭代器
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
                        Double d = cell.getNumericCellValue();
                        DecimalFormat df = new DecimalFormat("#.#########");
                        String value = df.format(d);
                        System.out.print(value + "\t");
                    } else {
                        System.out.print(cell.getStringCellValue() + "\t");
                    }
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
    //获取dataExcel文件
    public Workbook getWorkbook(String testDataFilePath){
        Workbook wb = null;
        boolean isE2007 = false;
        if (testDataFilePath.endsWith("xlsx")) {
            isE2007 = true;
        }
        InputStream input = null;
        try {

            input = new FileInputStream(testDataFilePath);
            //文件格式(2003或者2007)来初始化
            if (isE2007) {
                wb = new XSSFWorkbook(input);
            } else {
                wb = new HSSFWorkbook(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return wb;
    }
    //判断excel的字段类型
    public String valueType(HSSFCell hssfCell){
        if (hssfCell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
            return String.valueOf(hssfCell.getBooleanCellValue());
        }
        else if (hssfCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
            return String.valueOf(hssfCell.getNumericCellValue());
        }else {
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }
    //读取excel
    public void getCellValue(String excelFile) throws Exception {
        InputStream input=new FileInputStream(excelFile);
        POIFSFileSystem fs=new POIFSFileSystem(input);
        HSSFWorkbook wb=new HSSFWorkbook(fs);
        HSSFSheet
                hssfSheet=wb.getSheetAt(0);
        if (hssfSheet==null){
            return;
        }
        for (int rowNum=0;rowNum<=hssfSheet.getLastRowNum();rowNum++){
            HSSFRow hssfRow=hssfSheet.getRow(rowNum);
            if (hssfRow==null){
                continue;
            }
            for (int cellNum=0;cellNum<=hssfRow.getLastCellNum();cellNum++){
                HSSFCell hssfCell=hssfRow.getCell(cellNum);
                if (hssfCell==null){
                    continue;
                }
                System.out.print(" "+valueType(hssfCell));
            }
            System.out.println();
        }
    }
    //全部展示excel表格的内容
    public void vieWExcel(String excelFile) throws IOException {
        InputStream is=new FileInputStream(excelFile);
        POIFSFileSystem fs=new POIFSFileSystem(is);
        HSSFWorkbook wb=new HSSFWorkbook(fs);

        ExcelExtractor excelExtractor=new ExcelExtractor(wb);
        excelExtractor.setIncludeSheetNames(false);// 我们不需要Sheet页的名字
        System.out.println(excelExtractor.getText());
    }
}
