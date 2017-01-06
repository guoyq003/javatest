package com.jd.datedemo;

import javafx.scene.chart.PieChart;
import org.apache.log4j.helpers.DateTimeDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        System.out.println("==========");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMddHHmmss");
        String str="20170105135000";
        Date dt=sdf.parse(str);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
//        rightNow.add(Calendar.YEAR,-1);//日期减1年
//        rightNow.add(Calendar.MONTH,3);//日期加3个月
//        rightNow.add(Calendar.DAY_OF_YEAR,10);//日期加10天
        rightNow.add(Calendar.MINUTE,-5);
        Date dt1=rightNow.getTime();
        String reStr = sdf.format(dt1);
        System.out.println(reStr);
    }

}
