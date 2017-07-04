package com.jd.http.demo;

import com.google.common.collect.Lists;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import sun.font.FontUtilities;
import sun.misc.Sort;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;

public class MainTest {

    public static void main(String[] args) throws Exception {
        HttpClient client= HttpClients.createDefault();
        String url="http://oplog.shop.jd.com/json/vender/oplog_searchOpLogHbase.action";
        List<NameValuePair> params = Lists.newArrayList();
        params.add(new BasicNameValuePair("opLogQuery.businessType", "31"));
        params.add(new BasicNameValuePair("opLogQuery.operateObj", "457"));
        params.add(new BasicNameValuePair("opLogQuery.startTime", "2017-05-01"));
        params.add(new BasicNameValuePair("opLogQuery.endTime", "2017-05-07"));
        params.add(new BasicNameValuePair("opLogQuery.operateType", "459"));
        String parmStr=EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8));
        HttpGet get=new HttpGet(url+"?"+parmStr);
        String cookie="user-key=dae18ffb-581d-4b08-8f48-c97e319fef05; ipLoc-djd=1-2805-2855-0.137973775; ipLocation=%u5317%u4eac; cn=0; dmpjs=dmp-d453663b9af83b306e96250c760b67a1e42c83a; __jdv=122270672|dmp|dmp_76|cpc|dmp_76_11729_d453663b9af83b306e96250c760b67a1e42c83a_1496821056|1496821057918; unpl=V2_bzNtbRcHQxJyCRUDL0tdUWIBF1pKABYScQBGU3pJDlJvAhNUclRCFXMUR1NnGFUUZgsZXUNcQB1FCEdkeR5eA24zFVlEUkB7AQgwPAB%2bVHxjYRU%2bRigmfA4PQyhLGF1HYwQXDUsFQUZ0AEFcKRlYVTAzEV1yX3MVcABEXXwQVQRkAxBUQFdEEXIMTlR6KWwMbjMiBhc5RBwgCE5SfEpdUmAHEG1FUkUVdw5BV0sYbARXSHxcD1dGHXcBQV1yGF8FZQoQXUVTRBF9CEdkeilf; CCC_SE=ADC_5DcugB43kE6XKoz%2flLnIRYVoqo6CoSieUDs6BY2zqehyZvwWXf9l0iihwI3Sno0z4xH%2bqOsBuUe3GLmij0I4zZFvLjxqI6kopCZhjuatDHGV%2fWz2weYH3R8DMblbS2bpxxl2ZBaUIvL86s2ByNVNi2oXad0zmX8lLBxuoyzsQigpLYUgMVBcwPTcVarvoOSIS4q0uRbGP8m7ilFFsiVFElR0ceO2FfkBP2iwW251w3MlTBjb5oZDVIV1xhPn4RapRhbW0u2kpeo6j8kW47sQyEO%2bv1ChAeSeZwzxR%2fokf%2b2%2fnsv%2fqsDs9HMM4lm9sAoy9nbmWpoR2d2%2bHGvXydqoRCyMyn6vSx6Um7pwZ0D9f4rdy7n9AE636FvQK3GyTiwdMr3dpbQRJBtTd%2fngbKdmuBFrHz4rJJ6gPLBeyy3LyNSDVk5uE1YL65DOUU%2bFKbh5%2bkEIed2hoMaSIAyTCvcdXB9%2btsFMbsLexPCVNPEErvVrcgW1AY6mz%2fPrgoDkyAjf1BkgXLTPVg0a%2bFZ5FJ8DnkqYszb9QNdxP6OE5dE5WCPH8CXxki4gGcbOYC5WuAfq9WNWBJu%2b%2b7yRwBhJI686MplBSvwRDsADUhJYAgsTv24%3d; TrackID=1cCIAsaZYoMShSeAet4lZIVWJYudyI5RNj4DrnKWPkREjmwgIHXLiCdS7CU6sUcZx721s0n5eE6rw8wudxhuk7oRjpYdwj6j6xVF9CKNDBDI; pinId=pVvgI0wl9KjvvR5QKQZmjAIBFml8ld8v; pin=test_pop_deleteman; unick=test_pop_deleteman_n; thor=5BAAF94DA1C3BFAB8C49EEFB526E3D4031C8AD4B732C68B1C5F5B69324FBD78ECD69DCC1529E2B1CCFF3ED33D5C5F5D94CE0A0711B71CE11D30841356CCF6A4D6093289ECD7556F6FEF442E2A5EAB993E623D933EF5BC3E1D01D461E3CD4A2E2B4D10B10A5FFC21313E305979C402A4E1A14359C0CCBC449B136529E577E07D41CD7E6B2A7B9523BB9FA5124EEFD90089D36C77F480021B599214B05478D9583; _tp=qXPzzzlAilUHX8yAcqN5OgZM%2BJY38mH6Vq5Oq%2BhbLSw%3D; logining=1; _pst=test_pop_deleteman; ceshi3.com=000; _vender_=TNK3O6PALVQGHGYDAEEAVDBLCHMA34XJRVB62NIIFYLKJKYBCJQ46GCJB5HDE4PUHCX3FSLSVMXQFQ6SD7YGVGPAF7QXIUFRBXTNGLPDA3UHKUA5KV65HOC24JFKUS6PKO5MJKEXTMU4XUPO6Z7MTQXCJHUNGG4ZZ5BUKDM7I7PLZVV3GKJNOXI453OYTVEZVZF4L6UERUXLVW52MYQK6X4AFRA6OOFECLKYDLZ6LN7AOMH5WXHGIGCYFX46QIF5OOWOLIYU5BD45EIWABDGQ7544PB34UK5UEY674H2IVGDB4AO37TCEXRIHXPCNHN6ZYV4BZYXF4GJFI7FBN535U446PZZSME3YMTVP66ORWSDCYSFBYR27SVU3HTMLIMUJZD6BN2MKLROOAEPNG4Y3ZJBFQ23SY5Y33PKRK7DVSUMG7GTANVCCXYVITMSWBH2QBEIUB7EN4WTEJDTEXNVF7FFQU; _lvtc_=IXEATXCEPZFNEU7WC4RU74BQXY; __jda=164568289.1493868802138316565910.1493868802.1496821058.1496889504.24; __jdb=164568289.18.1493868802138316565910|24.1496889504; __jdc=164568289; __jdu=1493868802138316565910; 3AB9D23F7A4B3C9B=XWZTQZXNFUFXXPS6UC5PRIBY6M3UOD4YJV2I64XXW7EB2VIPICUHJ4X5ZCPEI3KNOX26ADLWMC4WFSFG7ZTXKL5ZRE";
        get.setHeader("Cookie",cookie);
        HttpResponse response=client.execute(get);
        System.out.println("response:"+response);
        HttpEntity entity=response.getEntity();
        String result= EntityUtils.toString(entity,"UTF-8");
        System.out.println("results是："+result);
    }
}
