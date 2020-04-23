package com.httpclient.core;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;


public class httpClientDemo {
    private String url;
    private ResourceBundle resourceBundle;
    private String testurl;
    @BeforeTest
    public void  beforeTest(){
        resourceBundle=ResourceBundle.getBundle("config/application", Locale.CHINA);
        url=resourceBundle.getString("test_url");
        testurl=url+resourceBundle.getString("demo_uri");
    }
    @Test
    public void httpClientTest() throws IOException {
        System.out.println("URL路径:"+testurl);
        HttpGet Hget =new HttpGet(testurl);
        HttpClient Http =new DefaultHttpClient();
        HttpResponse httpResponse=Http.execute(Hget);
        String reslut= EntityUtils.toString(httpResponse.getEntity(), "GBK");
        System.out.println("reslut:"+reslut);

    }
}
