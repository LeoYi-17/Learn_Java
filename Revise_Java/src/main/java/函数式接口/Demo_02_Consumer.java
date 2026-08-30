package 函数式接口;

import java.util.function.Consumer;

public class Demo_02_Consumer {
    public static void main(String[] args) {
        // 打印字符串长度
        method(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        },"abcde");
        System.out.println("————————————————————");
        method(s -> System.out.println(s.length()),"abcde");
    }
    public static void method(Consumer <String> consumer,String s){
        consumer.accept(s);
    }
}
