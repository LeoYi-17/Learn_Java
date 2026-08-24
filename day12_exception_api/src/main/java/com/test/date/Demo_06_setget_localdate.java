package com.test.date;

import org.junit.Test;
import java.time.LocalDate;

public class Demo_06_setget_localdate {
    @Test
    public void test01() {
        LocalDate localDate = LocalDate.now();
        //int getYear()->获取年份
        System.out.println(localDate.getYear());
        //int getMonthValue()->获取月份
        System.out.println(localDate.getMonthValue());
        //int getDayOfMonth()->获取月中的第几天
        System.out.println(localDate.getDayOfMonth());
    }
    @Test
    public void test02() {
        LocalDate localDate = LocalDate.now();
        //LocalDate withYear(int year):设置年份
        //LocalDate localDate1 = localDate.withYear(2020);
        //System.out.println(localDate1);
        //LocalDate withMonth(int month):设置月份
        //LocalDate localDate2 = localDate1.withMonth(5);
        //System.out.println(localDate2);
        //LocalDate withDayOfMonth(int day):设置月中的天数
        //LocalDate localDate3 = localDate2.withDayOfMonth(10);
        //System.out.println(localDate3);

        //链式调用
        LocalDate localDate1 = localDate.withYear(2026).withMonth(8).withDayOfMonth(9);
        System.out.println(localDate1);
    }
    @Test
    public void test03() {
        LocalDate localDate = LocalDate.now();
        //向后偏移
         LocalDate localDate1 = localDate.plusYears(1);
        //往前偏移
        LocalDate localDate2 = localDate.minusYears(1);
        System.out.println(localDate1.getYear());
        System.out.println(localDate2.getYear());
    }
}
