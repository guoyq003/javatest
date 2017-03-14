package com.jd.json.demo.GsonDemo.demo3;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        HashMap hashMap1=new HashMap();
        HashMap hashMap2=new HashMap();
        HashMap hashMap3=new HashMap();
        HashMap hashMap4=new HashMap();
        HashMap hashMap5=new HashMap();
        HashMap hashMap6=new HashMap();
        hashMap1.put("k","code1");
        hashMap1.put("v",1001);
        hashMap2.put("k","code2");
        hashMap2.put("v","性能测试");
        hashMap3.put("k","code3");
        hashMap3.put("v","www.test.com");
        hashMap4.put("k","code4");
        hashMap4.put("v","type1");
        hashMap5.put("k","code5");
        hashMap5.put("v","");
        hashMap6.put("k","code6");
        hashMap6.put("v","");
        List<HashMap> hashMapList=new ArrayList<HashMap>();
        hashMapList.add(hashMap1);
        hashMapList.add(hashMap2);
        hashMapList.add(hashMap3);
        hashMapList.add(hashMap4);
        hashMapList.add(hashMap5);
        hashMapList.add(hashMap6);
        DataList dataList=new DataList();
        dataList.setDetailList(hashMapList);
        dataList.setAssignUser("");
        dataList.setFormId(54658);
        List<DataList> lists=new ArrayList<DataList>();
        for (int i=1;i<=3;i++){
            lists.add(dataList);
        }
        FinalBean finalBean=new FinalBean();
        finalBean.setFormId(54658);
        finalBean.setDataList(lists);
        finalBean.set_time(System.currentTimeMillis()+80000);
        Gson gson=new Gson();
        String json=gson.toJson(finalBean);
        System.out.println(json);
        System.out.println("======================");
        finalBean=gson.fromJson(json,FinalBean.class);
    }
}
