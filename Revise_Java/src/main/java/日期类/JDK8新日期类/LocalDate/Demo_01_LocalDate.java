package 日期类.JDK8新日期类.LocalDate;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Demo_01_LocalDate {
    @Test
    public void test01(){
        // 获取当前时间(年月日)
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
    @Test
    public void test02(){
        // 根据指定的年月日创建LocalDate对象
        LocalDate localDate = LocalDate.of(2027, 1, 1);
        System.out.println(localDate);
    }
    @Test
    public void test03(){
        // 获取当前时间(年月日时分秒)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
    @Test
    public void test04(){
        // 根据指定的年月日时分秒创建LocalDate对象
        LocalDateTime localDateTime = LocalDateTime.of(2026, 12, 18, 0, 0, 0);
        System.out.println(localDateTime);
    }
    @Test
    public void test05(){
        // 获取年份,月份，月份中的第几天
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
    }
    @Test
    public void test06(){
        // 设置年份，月份，月中的天数
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.withYear(2026).withMonth(12).withDayOfMonth(18);
        System.out.println(localDate1);
    }

}
