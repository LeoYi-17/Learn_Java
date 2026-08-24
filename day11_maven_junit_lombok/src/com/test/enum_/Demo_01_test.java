package com.test.enum_;

public class Demo_01_test {
    public static void main(String[] args) {
        State WEIFUKUAN = State.WEIFUKUAN;
        System.out.println(WEIFUKUAN.getName());
        System.out.println("————————————————————————————————————————————");
        // String toString(),返回枚举值的名字,返回的是字符串
        State YIFUKUAN = State.YIFUKUAN;
        System.out.println(YIFUKUAN.toString());
        System.out.println("————————————————————————————————————————————");
        // values(),返回所有的枚举值
        State [] values = State.values();
        for (State value : values){
            System.out.println(value.getName());
        }
        System.out.println("————————————————————————————————————————————");
        // valueOf(String str),将一个字符串转成枚举类型
        State YISHOUHUO = State.valueOf("YISHOUHUO");
        System.out.println(YISHOUHUO);
    }
}
