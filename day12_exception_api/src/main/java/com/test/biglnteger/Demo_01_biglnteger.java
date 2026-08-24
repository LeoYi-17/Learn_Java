package com.test.biglnteger;

import java.math.BigInteger;

public class Demo_01_biglnteger {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("121212121212121212121212121212");
        BigInteger b2 = new BigInteger("121212121212121212121212121212");
        BigInteger add = b1.add(b2);
        System.out.println("b1加b2等于："+add);
        BigInteger subtract = b1.subtract(b2);
        System.out.println("b1减b2等于："+subtract);
        BigInteger multiply = b1.multiply(b2);
        System.out.println("b1乘b2等于："+multiply);
        BigInteger divide = b1.divide(b2);
        System.out.println("b1除b2等于："+divide);
    }
}
