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
import sun.misc.Sort;

import java.io.InputStream;
import java.util.Arrays;
import java.util.IdentityHashMap;

public class MainTest {

    public static void main(String[] args) throws Exception {
        int a=1234;
        String stra=String.valueOf(a);
        for (int i=stra.length()-1;i>=0;i--){
            System.out.print(stra.charAt(i));
        }
    }
}
