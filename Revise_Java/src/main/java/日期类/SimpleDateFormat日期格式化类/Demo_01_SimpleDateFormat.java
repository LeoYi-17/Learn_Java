package 日期类.SimpleDateFormat日期格式化类;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo_01_SimpleDateFormat {
    @Test
    public void test01(){
        // 获取系统当前时间，格式化成年‑月‑日 时:分:秒的字符串，打印输出到控制台
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        System.out.println(time);
    }
    @Test
    public void test02() throws ParseException {
        // 把字符串时间2020‑01‑01 12:12:12解析成Date对象，然后打印Date对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String time = "2020-01-01 12:12:12";
        Date date = simpleDateFormat.parse(time);
        System.out.println(date);

    }
}
