package com.httpclient.core;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class httpPostTestDemo {
    private String url;
    private ResourceBundle resourceBundle;

    @BeforeTest
    public void beforeTest(){
       resourceBundle=ResourceBundle.getBundle("config/application", Locale.CHINA);
       url=resourceBundle.getString("test_url");
    }
    @Test
    public void postTest() throws IOException {
        String uri=resourceBundle.getString("post_uri");
        String test_url=this.url+uri;
        System.out.println("test_url>>>>>>>>"+test_url);
        DefaultHttpClient httpClient=new DefaultHttpClient();
        HttpPost httpPost=new HttpPost(test_url);
        JSONObject param= new JSONObject();
        param.put("name","LHH");
        param.put("age","30");
        System.out.println("param>>>>>>>>>>>>>>>"+param);
        StringEntity entity=new StringEntity(param.toString(),"UTF-8");
        System.out.println("entity>>>>>>>>>>>>>>>"+entity);
        httpPost.setEntity(entity);
        HttpResponse httpResponse=httpClient.execute(httpPost);
        String reslut= EntityUtils.toString(httpResponse.getEntity(),"UTF-8");
        System.out.println("1>>>>>>>>>>>>>>>>>>>>>>>>>>"+reslut);
        JSONObject json=JSONObject.parseObject(reslut);
        System.out.println("2>>>>>>>>>>>>>>>>>>>>>>>>>>"+json);

    }
}
