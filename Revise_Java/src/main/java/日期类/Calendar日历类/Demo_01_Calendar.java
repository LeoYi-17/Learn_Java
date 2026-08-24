package 日期类.Calendar日历类;

import org.junit.Test;

import java.time.Year;
import java.util.Calendar;

public class Demo_01_Calendar {
    @Test
    public void test01(){
        // 获取当前年份，月份,日份
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH ) + 1);
        System.out.println(calendar.get(Calendar.DATE));
    }
    @Test
    public void test02(){
        // 设置年月日,输出2024年12月1日
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024,11,1);
        int year = calendar.get(Calendar.YEAR);
        int Month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        System.out.println(year+"年"+(Month+1)+"月"+day+"日");
    }
}
