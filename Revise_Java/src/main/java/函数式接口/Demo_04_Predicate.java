package 函数式接口;

import java.util.function.Predicate;

public class Demo_04_Predicate {
    public static void main(String[] args) {
        // 判断字符串长度
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 7;
            }
        },"abcdefg");
        System.out.println("——————————————");
        method(s-> s.length() == 7,"abcdefg");
    }
    public static void method(Predicate <String> predicate,String s){
        boolean test = predicate.test(s);
        System.out.println(test);
    }
}
