package com.testng.core.Depends;

import org.testng.annotations.Test;

public class dependDemo {
    @Test
    public void dependOnMethod(){
        System.out.println("depend方法1111111111111111111");
    }
    @Test(dependsOnMethods = {"dependOnMethod"})
    public void dependOnMethodTest(){
        System.out.println("depend方法2222222222222222222");
    }
}
