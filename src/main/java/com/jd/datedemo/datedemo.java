package com.jd.datedemo;

import javafx.scene.chart.PieChart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {
    public static void stringToDate(String dateStr) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
        Date date=simpleDateFormat.parse(dateStr);
        simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedTime = simpleDateFormat.format(date);
        System.out.println("---->将" + dateStr + "解析为:" + formattedTime);
    }
    public static String refFormatNowDate(String time) {
        Date nowTime = new Date(Long.valueOf(time));
        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String retStrFormatNowDate = sdFormatter.format(nowTime);
        return retStrFormatNowDate;
    }
    public static void main(String[] args) throws ParseException {
        String dateStr="20161227085009";
        stringToDate(dateStr);
        String time="1480051749185";
        System.out.println(refFormatNowDate(time));

    }

}
