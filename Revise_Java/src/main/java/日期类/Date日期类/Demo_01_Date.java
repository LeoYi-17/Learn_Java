package 日期类.Date日期类;

import org.junit.Test;

import java.util.Date;

public class Demo_01_Date {
    @Test
    public void test01(){
        // 输出当前日期时间
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println("——————————————————————");
    }
    @Test
    public void test02(){
        // 设置时间从时间原点开始,获取时间对应毫秒值
        Date date1 = new Date();
        date1.setTime(1000L);
        System.out.println(date1);
        Date date2 = new Date();
        System.out.println(date2.getTime());
    }
}
