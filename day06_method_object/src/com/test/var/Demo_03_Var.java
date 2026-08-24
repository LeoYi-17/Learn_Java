/*n个字符串进行拼接，每一个字符串之间使用某字符进行分隔，
如果没有传入字符串，那么返回空字符串""
sum("-","张三","李四","王五")   -> 张三-李四-王五*/
package com.test.var;

public class Demo_03_Var {
    public static void main(String[] args) {
        String info = string("-","王钰栋","张玉宁","韦世豪");
        System.out.println(info);
    }
    public static String string (String s,String...arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                str += arr[i];
            }else {
                str += arr[i]+s;
            }
        }
        return str;
    }
}
