package com.jd.json.demo.GsonDemo.demo1;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

public class MainTest {
    public static void main(String[] args) throws IOException {
        String jsonStr="{\n" +
                "    \"error\": 0,\n" +
                "    \"status\": \"success\",\n" +
                "    \"date\": \"2014-05-10\",\n" +
                "    \"results\": [\n" +
                "        {\n" +
                "            \"currentCity\": \"南京\",\n" +
                "            \"weather_data\": [\n" +
                "                {\n" +
                "                    \"date\": \"周六(今天, 实时：19℃)\",\n" +
                "                    \"dayPictureUrl\": \"http://api.map.baidu.com/images/weather/day/dayu.png\",\n" +
                "                    \"nightPictureUrl\": \"http://api.map.baidu.com/images/weather/night/dayu.png\",\n" +
                "                    \"weather\": \"大雨\",\n" +
                "                    \"wind\": \"东南风5-6级\",\n" +
                "                    \"temperature\": \"18℃\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"date\": \"周日\",\n" +
                "                    \"dayPictureUrl\": \"http://api.map.baidu.com/images/weather/day/zhenyu.png\",\n" +
                "                    \"nightPictureUrl\": \"http://api.map.baidu.com/images/weather/night/duoyun.png\",\n" +
                "                    \"weather\": \"阵雨转多云\",\n" +
                "                    \"wind\": \"西北风4-5级\",\n" +
                "                    \"temperature\": \"21 ~ 14℃\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        Gson gson=new Gson();
        Status status=gson.fromJson(jsonStr,Status.class);
        System.out.println("是否成功:"+status.getStatus());
        List<Results> resultsList=status.getResults();
        for (Results results:resultsList){
            System.out.println("城市:"+results.getCurrentCity());
            List<Weather> weatherList=results.getWeather_data();
            for (Weather weather:weatherList){
                if (weather.getTemperature().equals("18℃")){
                    weather.setTemperature("32℃");
                }
                System.out.println("日期:"+weather.getDate()+"\t"+"天气情况:"+weather.getWeather()+"\t"+"温度:"+weather.getTemperature());
            }
        }

        //读json文件
//        System.out.println("=====================================");
//        String readFileToString= FileUtils.readFileToString(new File("src/main/resources/gsondemo.json"),"UTF-8");
//        Status status1=gson.fromJson(readFileToString,Status.class);
//        System.out.println("是否成功:"+status.getStatus());
//        List<Results> resultsList1=status1.getResults();
//        for (Results results:resultsList1){
//            System.out.println("城市:"+results.getCurrentCity());
//            List<Weather> weatherList=results.getWeather_data();
//            for (Weather weather:weatherList){
//                System.out.println("日期:"+weather.getDate()+"\t"+"天气情况:"+weather.getWeather());
//            }
//        }
    }
}
