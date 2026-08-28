package String和StringBuilder;

import org.junit.Test;

public class Demo_01_String {
    @Test
    public void test01(){
        // 将byte数组的一部分转成String
        byte arr1[] = {97, 98, 99, 100,101,102};
        String s1 = new String(arr1, 0, 3);
        System.out.println(s1);
        System.out.println("——————————————————");
        // 将char数组的一部分转成String
        char arr2[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s2 = new String(arr2, 0, 2);
        System.out.println(s2);
    }
    @Test
    public void test02(){
        // 判断字符串内容是否一样
        String s1 = "abc";
        Boolean b1 = s1.equals("abc");
        System.out.println(b1);
        System.out.println("——————————————");
        // 判断字符串内容是否一样,忽略大小写
        String s2 = "aBc";
        Boolean b2 = s2.equalsIgnoreCase("aBc");
        System.out.println(b2);
    }
    @Test
    public void test03(){
        // 比较两个字符串
        String s1 = "abc";
        String s2 = "abc";
        if(s1.equals(s2)){
            System.out.println("是abc");
        }else {
            System.out.println("不是abc");
        }
    }
    @Test
    public void test04(){
        // 拼接字符串
        String s1 = "abc";
        String concat = s1.concat("def");
        System.out.println(concat);
    }
    @Test
    public void test05(){
        // 获取指定索引位置上的字符
        String s1 = "abcdefghiabcde";
        char charAt = s1.charAt(0);
        System.out.println(charAt);
        System.out.println("————————————");
        // 获取指定字符在老串儿中第一次出现的索引位置
        int indexOf = s1.indexOf("e");
        System.out.println(indexOf);
        System.out.println("————————————");
        // 从指定索引开始截取字符串到最后
        String substring1 = s1.substring(2);
        System.out.println(substring1);
        // 从指定索引位置开始截取到endIndex->含头不含尾
        String substring2 = s1.substring(0,4);
        System.out.println(substring2);
        // 获取字符串长度
        int length = s1.length();
        System.out.println(length);
    }
    @Test
    public void test06(){
        // 遍历字符串
        String s = "abcdefghijklmn";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
    @Test
    public void test07(){
        // 随便给一个字符串,统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
        String s = "AabcdBDeas123";
        int big = 0;
        int small = 0;
        int number = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 'A' && aChar <= 'Z'){
                big++;
            } else if (aChar >= 'a' && aChar <= 'z') {
                small++;
            }else if (aChar >= '1' && aChar <= '9'){
                number++;
            }
        }
        System.out.println("大写字符个数："+big);
        System.out.println("小写字符个数："+small);
        System.out.println("数字字符个数"+number);
    }
    @Test
    public void test08(){
        // 按照,分割字符串
        String s = "a,b,c,d";
        String[] split = s.split(",");
        for (String string : split) {
            System.out.println(string);
        }
    }
    @Test
    public void test09(){
        // 字符串大小写转换
        String s = "abcdEFG ";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println("————————————");
        // 判断指定字符串
        System.out.println(s.contains("bc"));
        System.out.println(s.endsWith("G"));
        System.out.println(s.startsWith("a"));
        // 去除两端空格
        System.out.println(s.trim());
    }
}
