package com.jd.http.demo;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChinacLoudAppLogin {
    public String getCookie(){
        HttpClient client= HttpClients.createDefault();
        HttpPost post=new HttpPost("http://gzdjyweb.chinacloudapp.cn/gzdjy-pc/member/passwordLogin");
        String cookie=null;
        try {
            List<BasicNameValuePair> parmameters=new ArrayList<BasicNameValuePair>();
            parmameters.add(new BasicNameValuePair("requestUrl","personalIndex"));
            parmameters.add(new BasicNameValuePair("account","13620227284"));
            parmameters.add(new BasicNameValuePair("password","0976d6ffe0ae00a63307ffaa02c345b0d004770f880b2e16c3a9c93e1c7c8859c38516865b736f784cda53d9b22aa649480b5e1f17a80721783fe43b7a3f5627b28068a72e21234a3f09b8705840a0fa30c38addd88506b22d4821b7f2574136b39aec48b3e1d46e79b8e59a94b889039348f3528188b63c85a06adddec6f9a4"));
            post.setEntity(new UrlEncodedFormEntity(parmameters,"UTF-8"));
            post.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.80 Safari/537.36");
            post.setHeader("Referer","http://gzdjyweb.chinacloudapp.cn/gzdjy-pc/pc/member/toPasswordLogin");
            post.setHeader("Origin","http://gzdjyweb.chinacloudapp.cn");
            post.setHeader("Accept","application/json, text/javascript, */*; q=0.01");
            post.setHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
            post.setHeader("Host","gzdjyweb.chinacloudapp.cn");
            post.setHeader("Accept-Encoding","gzip, deflate");
            post.setHeader("Accept-Language","zh-CN,zh;q=0.8");
            HttpResponse response=client.execute(post);
//            HttpEntity entity=response.getEntity();
//           String result= EntityUtils.toString(entity,"UTF-8");
//            System.out.println("results是："+result);
            Header header[]=response.getAllHeaders();
            for (int i=0;i<header.length;i++) {
//                System.out.println(header[i].getValue());
//                System.out.println(header[i]);
                if (header[i].getName().startsWith("Set-Cookie")) {
                    String cookieValues = header[i].getValue().split(";")[0];
                    if (cookieValues.startsWith("jsid")) {
                       cookie = cookieValues;
//                        System.out.println(cookie);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cookie;
    }


    public static void main(String[] args) throws Exception {
        ChinacLoudAppLogin chinacLoudAppLogin=new ChinacLoudAppLogin();
        String cookie=chinacLoudAppLogin.getCookie();
        HttpClient client= HttpClients.createDefault();
        HttpPost post=new HttpPost("http://gzdjyweb.chinacloudapp.cn/gzdjy-pc/pc/item/buyNow");
        List<BasicNameValuePair> parmameters=new ArrayList<BasicNameValuePair>();
        parmameters.add(new BasicNameValuePair("showId","6e914adf-1173-4a1d-9e1a-296c69a6a932"));
        parmameters.add(new BasicNameValuePair("farelevelId","07"));
        parmameters.add(new BasicNameValuePair("ticketNum","1"));
        parmameters.add(new BasicNameValuePair("ruleId",""));
        parmameters.add(new BasicNameValuePair("money","180"));
        post.setEntity(new UrlEncodedFormEntity(parmameters,"UTF-8"));
        post.setHeader("Cookie",cookie);
//        post.setHeader("Referer","http://gzdjyweb.chinacloudapp.cn/gzdjy-pc/pc/item/detail?projectId=4415156c-f897-4523-b4bd-f1311aa08906");
        HttpResponse response=client.execute(post);
        HttpEntity entity=response.getEntity();
        String result= EntityUtils.toString(entity,"UTF-8");
//        System.out.println("results是："+result);
        HttpGet get=new HttpGet("http://gzdjyweb.chinacloudapp.cn/gzdjy-pc/pc/shoppingcart/toList");
        get.setHeader("Cookie",cookie);
        response =client.execute(get);

    }
}
