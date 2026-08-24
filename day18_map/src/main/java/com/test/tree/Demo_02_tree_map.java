package com.test.tree;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo_02_tree_map {
    @Test
    public void test01(){
        TreeMap<String, String> map = new TreeMap<>();
        map.put("b", "汗滴禾下土");
        map.put("a", "锄禾日当午");
        map.put("c", "谁知盘中餐");
        map.put("d", "粒粒皆辛苦");
        System.out.println(map);
    }
    @Test
    public void test02(){
        TreeMap map = new TreeMap<Person,String>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()- o1.getAge();
            }
        });
        map.put(new Person("张三", 18), "杭州");
        map.put(new Person("李四", 15), "上海");
        map.put(new Person("王五", 20), "北京");
        System.out.println(map);
    }
}
