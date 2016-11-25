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
import org.apache.log4j.Logger;
import sun.font.FontUtilities;
import sun.misc.Sort;

import java.io.InputStream;

public class MainTest {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        
        System.out.println(a+" "+b);
    }
}
