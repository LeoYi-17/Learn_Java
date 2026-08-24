package com.test.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo_01_bigdecimal {
    @Test
    public void test1() {
        float a = 3.55F;
        float b = 2.12F;
        float sum = a+b;
        System.out.println(sum);

        float sub = a-b;
        System.out.println(sub);
    }

    @Test
    public void test2() {
        BigDecimal b1 = BigDecimal.valueOf(3.55);
        BigDecimal b2 = BigDecimal.valueOf(2.12);
        BigDecimal add = b1.add(b2);
        System.out.println("b1加b2等于："+add);
        BigDecimal sub = b1.subtract(b2);
        System.out.println("b1减b2等于："+sub);
        BigDecimal mul = b1.multiply(b2);
        System.out.println("b1乘b2等于："+mul);

        //如果除不尽，则抛出算数异常
        //BigDecimal div = b1.divide(b2);
        //System.out.println(div);

        //scale:保留2位小数，
        //RoundingMode.DOWN：直接截断（向下舍入，往零方向砍掉后面小数，不四舍五入）
        BigDecimal div = b1.divide(b2, 2, RoundingMode.DOWN);
        System.out.println("b1除b2等于："+div);
    }
}
