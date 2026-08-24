package com.test.tree;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo_01_tree_set {
    @Test
    public void test01(){
        TreeSet<String> set = new TreeSet<>();
        set.add("b.曲项向天歌");
        set.add("a.鹅鹅鹅");
        set.add("d.红掌拨清波");
        set.add("c.白毛浮绿水");
        System.out.println(set);
    }
    @Test
    public void test02(){
        TreeSet<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        set.add(new Person("张三", 18));
        set.add(new Person("李四", 15));
        set.add(new Person("王五", 20));
        System.out.println(set);
    }
}
