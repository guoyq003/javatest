package com.jd.http.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpResponse;

import java.io.InputStream;

public class MainTest {
    public static void main(String[] args) throws Exception {
       HttpClientTest httpClientTest=new HttpClientTest();
        httpClientTest.httpClientEntityTest();
    }
}
