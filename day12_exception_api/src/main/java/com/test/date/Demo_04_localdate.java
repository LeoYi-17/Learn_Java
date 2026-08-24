package com.test.date;

import org.junit.Test;

import java.time.LocalDate;

public class Demo_04_localdate {
    @Test
    public void test01(){
        // static LocalDate now() 从默认时区的系统时钟获取当前日期
        LocalDate local1 = LocalDate.now();
        System.out.println(local1);
        // static LocalDate of(int year, int month, int dayOfMonth)
        // 根据指定的年月日创建LocalDate对象
        LocalDate local2 = LocalDate.of(2026,8,9);
        System.out.println(local2);
    }
}
