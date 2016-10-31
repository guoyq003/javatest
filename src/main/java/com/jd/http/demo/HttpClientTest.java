package com.jd.http.demo;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URL;

public class HttpClientTest {
   public void uriTest() throws Exception{
       String urlString="http://fanyi.youdao.com/openapi.do?keyfrom=jdtest003&key=1551773209&type=data&doctype=json&version=1.1&q=cat";
       HttpGet httpGet=null;
       try {
           URI uri=new URIBuilder().setScheme("http")
                   .setHost("fanyi.youdao.com")
                   .setPath("/openapi.do")
                   .setParameter("keyfrom","jdtest003")
                   .setParameter("key","1551773209")
                   .setParameter("type","data")
                   .setParameter("doctype","json")
                   .setParameter("version","1.1")
                   .setParameter("q","cat")
                   .build();
           httpGet=new HttpGet(uri);
       } catch (Exception e){
           e.printStackTrace();
       }
       System.out.println(httpGet.getURI());
       URI uri=URI.create(urlString);
       System.out.println(uri.getPath());
       System.out.println(uri.getQuery());
       System.out.println(uri.getHost());
       URL url=new URL(urlString);
       System.out.println(url.getQuery());
   }
}
