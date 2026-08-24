package com.test.regex;

import org.junit.Test;

import java.util.Arrays;

public class Demo_01_regex {
    @Test
    public void test1() {
        String s = "1212121";
        /*
         * 正则表达式：[1-9][0-9]{4,14}
         * [1-9]：第一位必须是1‑9，不能以0开头
         * [0-9]{4,14}：后面跟4~14位数字（0‑9）
         * 整体总长度：1 + (4~14) = 5 ~ 15位数字
         * matches()：整个字符串必须完全匹配正则，部分匹配返回false
         */
        boolean result01 = s.matches("[1-9][0-9]{4,14}");
        System.out.println("result01 = " + result01);
    }
    @Test
    public void test2() {
        // 正则表达式-字符类
        //1.验证字符串是否以h开头,d结尾,中间是aeiou的某一个字符
        boolean result01 = "had".matches("[h][aeiou][d]");
        System.out.println("result01 = " + result01);
        //2.验证字符串是否以h开头,d结尾,中间不是aeiou的某一个字符
        boolean result02 = "had".matches("[h][^aeiou][d]");
        System.out.println("result02 = " + result02);
        //3.验证字符串是否是开头a-z的任意一个小写字母,后面跟ad
        boolean result03 = "aad".matches("[a-z][a][d]");
        System.out.println("result03 = " + result03);
    }
    @Test
    public void test3() {
        // 正则表达式-逻辑运算符
        //1.要求字符串是小写字母并且字符不能以[aeiou]开头,后面跟ad
        boolean result01 = "yad".matches("[[a-z]&&[^aeios]][a][d]");
        System.out.println("result01 = " + result01);
        //2.要求字符是aeiou的某一个字符开头,后面跟ad
        boolean result02 = "aad".matches("[a|e|i|o|u][a][d]");
        System.out.println("result02 = " + result02);
    }
    @Test
    public void test4() {
        // 正则表达式-预定义字符
        //1.验证字符串是否是三位数字
        //boolean result01 = "111".matches("[0-9][0-9][0-9]");
        boolean result01 = "111".matches("\\d\\d\\d");
        System.out.println("result01 = " + result01);

        //2.验证手机号: 1开头 第二位3 5 8 剩下的都是0-9的数字
        boolean result02 = "13838381438".matches("[1][358]\\d\\d\\d\\d\\d\\d\\d\\d\\d");
        System.out.println("result02 = " + result02);

        //3.验证字符串是否以h开头,d结尾,中间是任意一个字符
        boolean result03 = "had".matches("[h].[d]");
        System.out.println("result03 = " + result03);
    }
    @Test
    public void test5() {
        // 正则表达式-数量词
        //1.验证字符串是否是三位数字
        boolean result01 = "111".matches("\\d{3}");
        System.out.println("result01 = " + result01);

        //2.验证手机号: 1开头 第二位3 5 8 剩下的都是0-9的数字
        boolean result02 = "13838381438".matches("[1][358]\\d{9}");
        System.out.println("result02 = " + result02);

        //3.验证qq号:  不能是0开头,都是数字,长度为5-15
        boolean result03 = "12345678901".matches("[1-9]\\d{4,14}");
        System.out.println("result03 = " + result03);
    }
    @Test
    public void test6() {
        // 正则表达式-分组括号( )
        boolean result01 = "abcabcabcabc".matches("(abc)*");
        System.out.println("result01 = " + result01);
    }
    @Test
    public void test7() {
        //String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String[] arr1 = "abc haha  hehe".split(" +");
        System.out.println("arr1 = " + Arrays.toString(arr1));
        //String replaceAll(String regex, String replacement)把满足正则表达式的字符串,替换为新的字符
        String newStr = "abc haha  heihie   xixi".replaceAll(" +", "z");
        System.out.println("newStr = " + newStr);
    }
}
