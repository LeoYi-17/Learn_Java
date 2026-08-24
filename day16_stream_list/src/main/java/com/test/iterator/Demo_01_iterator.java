package com.test.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo_01_iterator {
    @Test
    public void method01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //获取迭代器对象
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
    @Test
    public void method02(){
        /*
        需求:定义一个集合,存储 唐僧,孙悟空,猪八戒,沙僧,遍历集合,
        如果遍历到猪八戒,往集合中添加一个白龙马
       */
        ArrayList<String> list = new ArrayList<>();
        list.add("唐僧");
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙僧");

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if("猪八戒".equals(element)){
                iterator.add("白龙马");
            }
        }
        System.out.println(list);
    }
}
