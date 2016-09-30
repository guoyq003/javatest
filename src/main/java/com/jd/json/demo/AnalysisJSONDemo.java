package com.jd.json.demo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Iterator;

/**
 * Created by guoyiqing1 on 2016/5/31.
 */
public class AnalysisJSONDemo {
    public static void main(String[] args) {
        String json_str="{\"total\":920,\"data\":[{\"ID\":\"634\",\"Name\":\"于东\"},{\"ID\":\"822\",\"Name\":\"于祎\"},{\"ID\":\"782\",\"Name\":\"于燕\"},{\"ID\":\"636\",\"Name\":\"于玲\"},{\"ID\":\"841\",\"Name\":\"于浩\"},{\"ID\":\"383\",\"Name\":\"于娟\"}]}";
        JSONObject jsonObject=JSONObject.fromObject(json_str);
//        System.out.println(jsonObject.get("total"));
        Iterator iterator=jsonObject.keys();
        while (iterator.hasNext()){
            System.out.println(jsonObject.get(iterator.next()));
        }
        System.out.println("=====================================");
        //找出date中ID的值
        JSONArray jsonArray=jsonObject.getJSONArray("data");
        String Ids="ID list:";
        for (int i=0;i<jsonArray.size();i++){
            JSONObject date= (JSONObject) jsonArray.get(i);
            System.out.println(date);
            String Id=(String) date.get("ID");
            if(i==jsonArray.size()-1){
                Ids+=Id;
            }else{
                Ids+=Id+",";
            }
//            System.out.println(jsonArray.getString(i));
        }
        System.out.println(Ids);
    }
}
