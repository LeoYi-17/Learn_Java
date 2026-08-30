package 函数式接口;

import java.util.function.Function;

public class Demo_03_Function {
    public static void main(String[] args) {
        // 把整型转成字符串，然后做字符串拼接运算
        method(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + "";
            }
        },100);
        System.out.println("——————————————");
        method(integer -> integer + "",100);
    }
    public static void method(Function <Integer,String> function,int num){
        String s = function.apply(num);
        System.out.println(s + 1);
    }
}
