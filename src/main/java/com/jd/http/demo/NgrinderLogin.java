package com.jd.http.demo;

import net.sf.json.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NgrinderLogin {
    public static void main(String[] args) {
        HttpClient client= HttpClients.createDefault();
        HttpPost post=new HttpPost("http://192.168.172.43:8019/form_login");
        try {
            //http://fanyi.youdao.com/openapi.do?keyfrom=jdtest003&key=1551773209&type=data&doctype=xml&version=1.1&q=dog
            List<BasicNameValuePair> parmameters=new ArrayList<BasicNameValuePair>();
            parmameters.add(new BasicNameValuePair("j_username","admin"));
            parmameters.add(new BasicNameValuePair("j_password","admin"));
//            parmameters.add(new BasicNameValuePair("x","54"));
//            parmameters.add(new BasicNameValuePair("y","28"));
            parmameters.add(new BasicNameValuePair("native_language","cn"));
            parmameters.add(new BasicNameValuePair("user_timezone","Asia/Shanghai"));
            post.setEntity(new UrlEncodedFormEntity(parmameters,"UTF-8"));
            HttpResponse response=client.execute(post);
            //获取cookie
            Header header[]=response.getAllHeaders();
            for (int i=0;i<header.length;i++){
//                System.out.println(header[i].getValue());
                System.out.println(header[i]);
                if (header[i].getName().startsWith("Set-Cookie")){
//                    System.out.println(header[i].getValue().split(";")[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
