package com.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo_01_junit {
    @Test
    public void test01(){
        System.out.println("test01");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }
    @Before
    public void before(){
        System.out.println("before");
    }
    @After
    public void after(){
        System.out.println("after");
    }
}
