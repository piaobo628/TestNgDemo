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
    @Test(groups ={"ssss2"})
    public void groupTest3(){
        System.out.println("grouptest3333的test333333方法");
    }
    @Test(groups ={"ssss2"})
    public void groupTest4(){
        System.out.println("grouptest44444的test444444444方法");
    }
    @BeforeGroups("ssss1")
    public void beforeGroupTest1(){
        System.out.println("beforeGroupTest1的test方法");
    }
    @AfterGroups("ssss1")
    public void afterGroupTest1(){
        System.out.println("afterGroupTest1的test方法");
    }
    @BeforeGroups("ssss2")
    public void beforeGroupTest2(){
        System.out.println("beforeGroupTest2的test方法");
    }
    @AfterGroups("ssss2")
    public void afterGroupTest2(){
        System.out.println("afterGroupTest2的test方法");
    }

}
