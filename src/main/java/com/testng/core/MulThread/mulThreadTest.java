package com.testng.core.MulThread;

import org.testng.annotations.Test;

public class mulThreadTest {
    @Test
    public  void mulThreadtest1(){
        System.out.println("mulThreadtest1线程ID："+Thread.currentThread().getId());
    }
    @Test
    public  void mulThreadtest2(){
        System.out.println("mulThreadtest2线程ID："+Thread.currentThread().getId());
    }
    @Test
    public  void mulThreadtest3(){
        System.out.println("mulThreadtest3线程ID："+Thread.currentThread().getId());
    }
}
