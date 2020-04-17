package com.testng.core.Groups;


import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupDemo {

    @Test(groups ={"ssss1"})
    public void groupTest1(){
        System.out.println("grouptest1111的test11111111方法");
    }
    @Test(groups ={"ssss1"})
    public void groupTest2(){
        System.out.println("grouptest2222222的test2222222方法");
    }
    @BeforeGroups("ssss1")
    public void beforeGroupTest1(){
        System.out.println("beforeGroupTest1的test方法");
    }
    @AfterGroups("ssss1")
    public void afterGroupTest1(){
        System.out.println("afterGroupTest1的test方法");
    }

}
