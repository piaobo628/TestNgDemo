package com.testng.core.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class dataProviderTest {
    @Test(dataProvider = "data")
    public void dataTest1(String name,int age){
        System.out.println("dataTest1的："+"名字"+name+" ;年龄"+age);
    }
    @Test(dataProvider = "data")
    public void dataTest2(String name,int age){
        System.out.println("dataTest2的："+"名字"+name+" ;年龄"+age);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(Method method){
        Object[][] objects=null;
        if(method.getName().equals("dataTest1")) {
            objects = new Object[][]{
                    {"lhh", 20}, {"cyy", 30}, {"lzy", 10}
            };
        }
        else if (method.getName().equals("dataTest2")){
            objects =new Object[][]{
                    {"lzr",11},{"ytt",20},{"rff",30}
            };
        }
        return objects;
        }
    }

