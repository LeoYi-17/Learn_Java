package com.test.date;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo_08_datetime_formatter {
    @Test
    public void test01() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String time = dtf.format(localDateTime);
        System.out.println(time);

    }
    @Test
    public void test02() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = "2020-01-01 12:12:12";
        //TemporalAccessor temporalAccessor = dtf.parse(time);
        //System.out.println(temporalAccessor);
        //LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        //System.out.println(localDateTime);
        LocalDateTime localDateTime = LocalDateTime.parse(time, dtf);
        System.out.println(localDateTime);
    }
}
