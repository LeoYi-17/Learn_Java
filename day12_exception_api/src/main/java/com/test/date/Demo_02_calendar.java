package com.test.date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Demo_02_calendar {
    @Test
    public void test01(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
    @Test
    public void test02() {
        Calendar calendar = Calendar.getInstance();
        //int get(int field) ->返回给定日历字段的值
        System.out.println(calendar.get(Calendar.YEAR));
        //void set(int field, int value)  :将给定的日历字段设置为指定的值
        calendar.set(Calendar.YEAR, 2000);
        System.out.println(calendar.get(Calendar.YEAR));
        //void add(int field, int amount) :根据日历的规则,为给定的日历字段添加或者减去指定的时间量
        calendar.add(Calendar.YEAR, -1);
        System.out.println(calendar.get(Calendar.YEAR));
        //Date getTime():将Calendar转成Date对象
        Date date = calendar.getTime();
        System.out.println(date);
    }
    @Test
    public void test03(){
        // 输出2000年2月最后一天

        // 1.获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 2.定义一个year代表年份
        int year = 2000;
        /*
            3.设置年月日
            由于Calendar类中的月份从0开始计算,所以2月为3月
        */
        calendar.set(2000,2,1);
        // 4.让day减1,就是2月的最后一天
        calendar.add(Calendar.DATE,-1);
        // 5.获取减1之后的日
        int resultday = calendar.get(Calendar.DATE);
        System.out.println(resultday);
    }
}
