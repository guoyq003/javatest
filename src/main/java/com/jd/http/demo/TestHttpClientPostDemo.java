package com.jd.http.demo;

import net.sf.json.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by guoyiqing1 on 2016/5/25.
 */
public class TestHttpClientPostDemo {
    public static void main(String[] args) {
        new Post().start();
    }
}
class Post extends Thread{
    HttpClient client= HttpClients.createDefault();
    @Override
    public void run(){
        HttpPost post=new HttpPost("http://fanyi.youdao.com/openapi.do");
        try {
            //http://fanyi.youdao.com/openapi.do?keyfrom=jdtest003&key=1551773209&type=data&doctype=xml&version=1.1&q=dog
            List<BasicNameValuePair> parmameters=new ArrayList<BasicNameValuePair>();
            parmameters.add(new BasicNameValuePair("keyfrom","jdtest003"));
            parmameters.add(new BasicNameValuePair("key","1551773209"));
            parmameters.add(new BasicNameValuePair("type","data"));
            parmameters.add(new BasicNameValuePair("doctype","json"));
            parmameters.add(new BasicNameValuePair("version","1.1"));
            parmameters.add(new BasicNameValuePair("q","cat"));
            post.setEntity(new UrlEncodedFormEntity(parmameters,"UTF-8"));
            HttpResponse response=client.execute(post);
            Header header[]=response.getAllHeaders();//获取返回的header
            for (int i=0;i<header.length;i++){
                System.out.println(header[i].getName()+"=="+header[i].getValue());
                if (header[i].getName().startsWith("Set-Cookie")){
                    System.out.println("cookie的值是:"+header[i].getValue().split(";")[0]);
                }
            }
            HttpEntity entity=response.getEntity();
            String result= EntityUtils.toString(entity,"UTF-8");
            System.out.println("results是："+result);
            JSONObject jsonObject=JSONObject.fromObject(result);
            JSONObject jsonObject1= (JSONObject) jsonObject.get("basic");
            Iterator iterator=jsonObject1.keys();
            while (iterator.hasNext()){
                String key= (String) iterator.next();
                Object value=jsonObject1.get(key);
                System.out.println(key+"="+value);
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
}
