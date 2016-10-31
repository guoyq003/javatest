package com.jd.http.demo;

import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class HttpClientTest {
   public void httpRequest() throws Exception{
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
    public void httpResponseTest() throws Exception{
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        System.out.println(response.getProtocolVersion());
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.getStatusLine().getReasonPhrase());
        System.out.println(response.getStatusLine().toString());
        System.out.println("=====================================");
        HttpResponse response1 = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        response1.addHeader("Set-Cookie",
                "c1=a; path=/; domain=localhost");
        response1.addHeader("Set-Cookie",
                "c2=b; path=\"/\", c3=c; domain=\"localhost\"");
        Header h1 = response1.getFirstHeader("Set-Cookie");
        System.out.println(h1);
        Header h2 = response1.getLastHeader("Set-Cookie");
        System.out.println(h2);
        Header[] hs = response1.getHeaders("Set-Cookie");
        System.out.println(hs.length);
        System.out.println("=========================================");
        HttpResponse response2 = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        response2.addHeader("Set-Cookie",
                "c1=a; path=/; domain=localhost");
        response2.addHeader("Set-Cookie",
                "c2=b; path=\"/\", c3=c; domain=\"localhost\"");

        HeaderIterator it = response2.headerIterator("Set-Cookie");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=========================================");
        HttpResponse response3 = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        response3.addHeader("Set-Cookie",
                "c1=a; path=/; domain=localhost");
        response3.addHeader("Set-Cookie",
                "c2=b; path=\"/\", c3=c; domain=\"localhost\"");

        HeaderElementIterator iterator = new BasicHeaderElementIterator(
                response3.headerIterator("Set-Cookie"));
        while (iterator.hasNext()) {
            HeaderElement elem = iterator.nextElement();
            System.out.println(elem.getName() + " = " + elem.getValue());
            NameValuePair[] params = elem.getParameters();
            for (int i = 0; i < params.length; i++) {
                System.out.println(" " + params[i]);
            }
        }
        System.out.println("======================================");
        StringEntity myEntity = new StringEntity("important message",
                ContentType.create("text/plain", "UTF-8"));

        System.out.println(myEntity.getContentType());
        System.out.println(myEntity.getContentLength());
        System.out.println(EntityUtils.toString(myEntity));
        System.out.println(EntityUtils.toByteArray(myEntity).length);
    }
    public void httpClientEntityTest() throws Exception{
        StringEntity myEntity = new StringEntity("important message",
                ContentType.create("text/plain", "UTF-8"));

        System.out.println(myEntity.getContentType());
        System.out.println(myEntity.getContentLength());
        System.out.println(EntityUtils.toString(myEntity));
        System.out.println(EntityUtils.toByteArray(myEntity).length);
        System.out.println("==================================");
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://fanyi.youdao.com/openapi.do?keyfrom=jdtest003&key=1551773209&type=data&doctype=json&version=1.1&q=cat");
        CloseableHttpResponse response = httpclient.execute(httpget);
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                try {
                    System.out.println(instream);
                } finally {
                    instream.close();
                }
            }
        } finally {
            response.close();
        }
        System.out.println("==================================");
        CloseableHttpClient httpclient1 = HttpClients.createDefault();
        HttpGet httpget1 = new HttpGet("http://fanyi.youdao.com/openapi.do?keyfrom=jdtest003&key=1551773209&type=data&doctype=json&version=1.1&q=cat");
        CloseableHttpResponse response1 = httpclient.execute(httpget);
        try {
            HttpEntity entity = response1.getEntity();
            if (entity != null) {
                InputStream instream = entity.getContent();
                int byteOne = instream.read();
                int byteTwo = instream.read();
                System.out.println(byteOne+"\t"+byteTwo);
            }
        } finally {
            response1.close();
        }
    }
}
