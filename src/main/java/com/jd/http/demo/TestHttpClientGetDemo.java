package com.jd.http.demo;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created by guoyiqing1 on 2016/5/23.
 */
public class TestHttpClientGetDemo {
    public static void main(String[] args) {
        new Get().start();
    }
}
class Get extends Thread{
    HttpClient client= HttpClients.createDefault();

    @Override
    public void run() {
//        String url="http://fanyi.youdao.com/openapi.do?keyfrom=jdtest003&key=1551773209&type=data&doctype=json&version=1.1&"+"q=cat";
        String url="https://order.shop.jd.com/order/sopUp_waitOutList.action";
        HttpGet get=new HttpGet(url);
        try {
            HttpResponse res=client.execute(get);
            HttpEntity entity= res.getEntity();
            String result= EntityUtils.toString(entity,"UTF-8");
            System.out.println("返回描述:"+res.getStatusLine().getReasonPhrase());
            System.out.println("返回状态："+res.getStatusLine().getStatusCode());
            System.out.println("http信息："+res.getStatusLine().toString());
            System.out.println(result);
            JSONObject jsonObject=JSONObject.fromObject(result);
//            System.out.println(jsonObject.get("errorCode"));
            System.out.println(jsonObject.get("basic"));
            JSONObject jsonObject1= (JSONObject) jsonObject.get("basic");
            Iterator iterator=jsonObject1.keys();
            while (iterator.hasNext()){
                String key= (String) iterator.next();
                Object value= jsonObject1.get(key);
                System.out.println(key+"="+value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}