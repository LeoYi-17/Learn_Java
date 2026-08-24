package com.test.b_stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo_01_stream {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("马尔扎哈");
        list.add("张三");
        list.add("张无忌");
        list.add("马帅");
        list.add("张杰");
        list.add("鹿晗");
        list.add("蔡徐坤");
        list.add("张三丰");
        list.add("张友人");

         /* //需要1:筛选出姓张的人名
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                list1.add(s);
            }
        }
        //需求2:筛选出长度为3的人名
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if(s.length() == 3){
                list2.add(s);
            }
        }

        //需求3:遍历list2
        for (String s : list2) {
            System.out.println(s);
        }*/

        Stream<String> stream = list.stream();
        stream.filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
    @Test
    public void test02(){
        // 1.针对于数组
        Stream<String> stringStream = Stream.of("樱桃小丸子", "喜洋洋", "猫和老鼠", "黑猫警长");
        System.out.println(stringStream);
        //2.针对于集合
        ArrayList<String> list = new ArrayList<>();
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("马尔扎哈");
        Stream<String> stream2 = list.stream();
        System.out.println(stream2);
    }
    @Test
    public void test03(){
        Stream<String> stringStream = Stream.of("cherry", "apple", "banana", "orange");
        stringStream.forEach(s -> System.out.println(s));
    }
    @Test
    public void test04(){
        Stream<String> stringStream = Stream.of("cherry", "apple", "banana", "orange");
        System.out.println(stringStream.count());
    }
    @Test
    public void test05() {
        Stream<String> stream = Stream.of("熊出没", "数码宝贝", "神厨小福贵", "啄木鸟","灌篮高手","七龙珠");
        /*Stream<String> stream1 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 3;
            }
        });

        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        /*stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        stream.filter(s -> s.length()>3).forEach(s -> System.out.println(s));
    }
    @Test
    public void test06() {
        Stream<String> stream = Stream.of("熊出没", "数码宝贝", "神厨小福贵", "啄木鸟","灌篮高手","七龙珠");
        stream.limit(3).forEach(s -> System.out.println(s));
    }
    @Test
    public void test07() {
        Stream<String> stream = Stream.of("熊出没", "数码宝贝", "神厨小福贵", "啄木鸟","灌篮高手","七龙珠");
        stream.skip(3).forEach(s -> System.out.println(s));
    }
    @Test
    public void test08() {
        Stream<String> stream1 = Stream.of("熊出没", "数码宝贝", "神厨小福贵", "啄木鸟","灌篮高手","七龙珠");
        Stream<String> stream2 = Stream.of("火力少年王","开心宝贝","神奇宝贝","甜心宝贝","恐龙宝贝");
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));
    }
    @Test
    public void test09() {
        Stream<String> stream = Stream.of("熊出没", "数码宝贝", "神厨小福贵", "啄木鸟","灌篮高手","七龙珠");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
    @Test
    public void test10(){
        Stream<String> stream = Stream.of("熊出没", "数码宝贝", "神厨小福贵", "啄木鸟","灌篮高手","七龙珠","七龙珠");
        stream.distinct().forEach(s -> System.out.println(s));

        System.out.println("——————————————————————————————————");

        Stream <Person> stream2 = Stream.of(new Person("张三",18),new Person("张三",18),new Person("张三",28));
        stream2.distinct().forEach(person -> System.out.println(person));
    }
    @Test
    public void test11() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.map(integer-> integer+"").forEach(s -> System.out.println(s+1));
    }
    @Test
    public void test12() {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        //将两个集合转成Stream流
        Stream<String> stream1 = one.stream();
        Stream<String> stream2 = two.stream();
        Stream<String> streamOne = stream1.filter(s -> s.length() == 3).limit(3);
        Stream<String> streamTwo = stream2.filter(s -> s.startsWith("张")).skip(2);

        Stream.concat(streamOne,streamTwo).forEach(s -> System.out.println(s));
    }
}
