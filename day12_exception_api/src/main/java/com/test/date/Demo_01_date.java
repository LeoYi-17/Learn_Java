package com.test.date;

import org.junit.Test;

import java.util.Date;

public class Demo_01_date {
    @Test
    public void Test01(){
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println("——————————————————————————————————————————");
        Date date2 = new Date(1000L);
        System.out.println(date2);
    }
    @Test
    public void Test02(){
        Date date1 = new Date();
        date1.setTime(1000L);
        System.out.println(date1);
        System.out.println("——————————————————————————————————————————");
        Date date2 = new Date();
        System.out.println(date2.getTime());

    }
}
