package 日期类.JDK8新日期类.Period和Duration类;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Demo_01_PeriodDuration {
    @Test
    public void test01(){
        // Period 计算日期之间的偏差
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2003, 2, 17);
        Period period = Period.between(localDate2, localDate1);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
    @Test
    public void test02(){
        // Duration计算时间之间的偏差
        LocalDateTime localDateTime1 = LocalDateTime.of(2026,8,27,20,44,10);
        LocalDateTime localDateTime2 = LocalDateTime.of(2003, 2, 17,20,44,10);
        Duration duration = Duration.between(localDateTime2, localDateTime1);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
    }
}
