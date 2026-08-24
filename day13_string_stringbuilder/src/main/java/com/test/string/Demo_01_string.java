package com.test.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo_01_string {
    @Test
    public void test1() {
        //a.String() 根据空参构造创建String对象
        String s1 = new String();
        System.out.println("s1 = " + s1);
        //b.String(String str) 根据字符串创建String对象
        String s2 = new String("abc");
        System.out.println("s2 = " + s2);
        //c.String(byte[] bytes) 根据byte数组创建String对象
        byte[] bytes = {97, 98, 99};
        String s3 = new String(bytes);
        System.out.println("s3 = " + s3);
        //d.String(char[] chars) 根据char数组创建String对象
        char[] chars = {'a', 'b', 'c'};
        String s4 = new String(chars);
        System.out.println("s4 = " + s4);
        //简化形式
        String s5 = "abc";
        System.out.println("s5 = " + s5);
    }
    @Test
    public void test2() {
/*        a.String(byte[] bytes,int offset,int count)-> 将byte数组的一部分转成String
        bytes:代表数组
        offset:从数组的哪个索引开始转
        count:转多少个*/

        byte[] bytes = {97, 98, 99, 100,101,102};
        String s1 = new String(bytes, 0, 3);
        System.out.println("s1 = " + s1);

 /*       b.String(char[] chars,int offset,int length) -> 将char数组的一部分转成String
        chars:代表数组
        offset:从数组的哪个索引开始转
        length:转多少个*/
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s2 = new String(chars, 0, 3);
        System.out.println("s2 = " + s2);
    }
    @Test
    public void test3() {
        String s = "abc";
        //boolean equals(Objec obj) 判断字符串内容是否一样
        boolean b = s.equals("abc");
        System.out.println("b = " + b);
        //boolean equalsIgnoreCase(String str) 判断字符串内容是否一样,忽略大小写
        boolean result = "abc".equalsIgnoreCase("aBC");
        System.out.println("result = " + result);
    }
    @Test
    public void test4() {
        String s = "abc";
        s = null;
        //int compareTo(String str) 比较两个字符串
    /* if (s.equals("abc")){
         System.out.println("是abc");
     }else{
         System.out.println("不是abc");
     }*/

        if ("abc".equals(s)){
            System.out.println("是abc");
        }else{
            System.out.println("不是abc");
        }
    }
    @Test
    public void test5() {
        String str = "abcdefg";
        //1.String concat(String str) 字符串拼接,返回的是新的字符串
        String newStr1 = str.concat("haha");
        System.out.println("newStr1 = " + newStr1);
        //2.char charAt(int index) 获取指定索引位置上的字符
        char data1 = str.charAt(0);
        System.out.println("data1 = " + data1);
        //3.int indexOf(String str) 获取指定字符在老串儿中第一次出现的索引位置
        int index = str.indexOf("c");
        System.out.println("index = " + index);
        //4.String subString(int beginIndex) 从指定索引开始截取字符串到最后
        String newStr2 = str.substring(2);
        System.out.println("newStr2 = " + newStr2);
        //5.String subString(int beginIndex,int endIndex) 从指定索引位置开始截取到endIndex->含头不含尾
        String newStr3 = str.substring(2,4);
        System.out.println("newStr3 = " + newStr3);
        //6.int length()获取字符串长度
        System.out.println("str.length() = " + str.length());
    }
    @Test
    public void  test6(){
        // 遍历字符串
        String str = "abcdefg";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    @Test
    public void test7() throws UnsupportedEncodingException {
        String s = "abcdefg";
        //1.char[] toCharArray()将字符串转成char数组
        char[] chars = s.toCharArray();
        System.out.println(chars);
        //2.byte[] getBytes()将字符串转成byte数组
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        /*
           3.byte[] getBytes(String charsetName)根据指定的编码集将字符串转成byte数组
             ASCII码表:主要针对说英文的人
             GBK:中文字符集 -> 国标码 -> 一个汉字占2个字节
             UTF-8:万国码 -> 一个汉字占3个字节
             idea -> 默认编码集:UTF-8
         */
        byte[] bytes1 = "你".getBytes();//不指定编码表就按照默认的UTF-8走
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = "你".getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
        //4.String replace(CharSequence target, CharSequence replacement) ->将前面参数替换成后面的参数
        String newStr = "asdfasdfa".replace("a", "z");
        System.out.println("newStr = " + newStr);
    }
    @Test
    public void test8() {
        //1.定义一个字符串
        String str = "sdfaWERWERWE11231";
        //2.定义三个变量,分别表示大写字母个数,小写字母个数,数字个数
        int big = 0;
        int small = 0;
        int number = 0;
        //3.遍历字符串,将每一个字符都获取出来
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 'A' && aChar <= 'Z'){
                big++;
            }else if (aChar >= 'a' && aChar <= 'z'){
                small++;
            }else if (aChar >= '0' && aChar <= '9'){
                number++;
            }
        }
        System.out.println("大写字母个数 = " + big);
        System.out.println("小写字母个数 = " + small);
        System.out.println("数字个数 = " + number);
    }
    @Test
    public void test9(){
        String str = "abc,def,ghi";
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println("————————————————————————————————————————");
        String str2 = "abc.txt.test";
        String[] split2 = str2.split("\\.");
        for (String s2 : split2) {
            System.out.println(s2);
        }
    }
    @Test
    public void test10() {
        String s = "abcdefg";
        //1.boolean contains(String s):判断老串中是否包含指定的串儿
        System.out.println(s.contains("abc"));
        //2.boolean endsWith(String s):判断是否以指定的串儿结尾
        System.out.println(s.endsWith("g"));
        //3.boolean startsWith(String s):判断是否以指定的串儿开头
        System.out.println(s.startsWith("a"));
        //4.String toLowerCase()将字母转成小写
        System.out.println("DAFDAF".toLowerCase());
        //5.String toUpperCase()将字母转成大写
        System.out.println("sfsd".toUpperCase());
        //6.String trim()去掉字符串两端空格
        System.out.println("  ab c  ".trim());
        System.out.println("  ab c  ".replace(" ", ""));
    }
    @Test
    public void test11(){
        // 文本块使用
        String s = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>首页</title>
                </head>
                <body>
                    哈哈哈
                </body>
                </html>
                """;
        System.out.println(s);
    }
}
