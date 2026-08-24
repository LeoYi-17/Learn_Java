package com.test.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_01_list {
    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<>();
        //boolean add(E e)  -> 将元素添加到集合中->尾部(add方法一定能添加成功的,所以我们不用boolean接收返回值)
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        //void add(int index, E element) ->在指定索引位置上添加元素
        list.add(1, "赵六");
        System.out.println(list);
        //boolean remove(Object o) ->删除指定的元素,删除成功为true,失败为false
        list.remove("王五");
        System.out.println(list);
        //E remove(int index) -> 删除指定索引位置上的元素,返回的是被删除的那个元素
        String element = list.remove(1);
        System.out.println(element);
        System.out.println(list);
        //E set(int index, E element) -> 将指定索引位置上的元素,修改成后面的element元素
        String element2 = list.set(0, "涛哥");
        System.out.println(element2);
        System.out.println(list);
        //E get(int index) -> 根据索引获取元素
        System.out.println(list.get(0));
        //int size()  -> 获取集合元素个数
        System.out.println(list.size());

        System.out.println("=============================");
        //迭代器
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element3 = iterator.next();
            System.out.println(element3);
        }

        System.out.println("==========================");
        //快捷键:集合名.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("==========================");

        //增强for: 集合名.for
        for (String s : list) {
            System.out.println(s);
        }
    }
    @Test
    public void test2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
