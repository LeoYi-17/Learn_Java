package com.test.date;

import org.junit.Test;

import java.time.LocalDateTime;

public class Demo_05_localdatetime {
    @Test
    public void test01() {
        //static LocalDateTime now()
        LocalDateTime local1 = LocalDateTime.now();
        System.out.println(local1);
        //static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        LocalDateTime local2 = LocalDateTime.of(2026, 8, 9, 16, 36, 10);
        System.out.println(local2);
    }

}
