package com.test.map;

import org.junit.Test;

import java.util.*;

public class Demo_01_hashmap {
    @Test
    public void test01(){
        HashMap<String, String> map = new HashMap<>();
        //V put(K key, V value)  -> 添加元素,返回的是被替换的value值
        map.put("1","张三");
        map.put("2","李四");
        map.put("2", "王五");
        map.put("3", "赵六");
        map.put("4", "田七");
        map.put("5", "朱八");
        //map.put(null,null);
        System.out.println(map);
        //V remove(Object key)  ->根据key删除键值对,返回的是被删除的value
        String value = map.remove("1");
        System.out.println(value);
        System.out.println(map);
        //V get(Object key) -> 根据key获取value
        String value1 = map.get("2");
        System.out.println(value1);
        //boolean containsKey(Object key)  -> 判断集合中是否包含指定的key
        boolean b = map.containsKey("2");
        System.out.println(b);
        //Collection<V> values() -> 获取集合中所有的value,转存到Collection集合中
        Collection<String> values = map.values();
        System.out.println(values);
    }
    @Test
    public void test02() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("2", "王五");
        map.put("5", "朱八");
        map.put("4", "田七");
        map.put("3", "赵六");
        System.out.println(map);
    }
    @Test
    public void test03(){
        // HashMap的遍历方式
        // 获取key,根据key再获取value
        HashMap<String, String> map = new HashMap<>();
        map.put("大郎","金莲");
        map.put("岩朔","王婆");
        map.put("硕鑫","雨姐");
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
    @Test
    public void test04(){
        // HashMap的遍历方式
        // 同时获取key和value
        HashMap<String, String> map = new HashMap<>();
        map.put("大郎","金莲");
        map.put("岩朔","王婆");
        map.put("硕鑫","雨姐");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
    @Test
    public void test05() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("涛哥", 18), "廊坊");
        map.put(new Person("硕鑫", 20), "济南");
        map.put(new Person("岩朔",22), "通辽");
        map.put(new Person("彭思",16),"辽宁");
        map.put(new Person("彭思",16),"北京");
        System.out.println(map);
    }
    @Test
    public void test06(){
        // 用Map集合统计字符串中每一个字符出现的次数
        //1.指定一个字符串
        String s = "adfasdfas";
        //2.创建一个map集合,key指定为String代表字符,value为Integer代表字符个数
        HashMap<String, Integer> map = new HashMap<>();
        //3.遍历字符串,用每一个字符去判断,Map中是否包含字符
        char[] chars = s.toCharArray();
        for (char c : chars) {
            String key = c + "";
            //4.如果不包含,将字符和1存到map中
            if (! map.containsKey(key)) {
                map.put(key, 1);
            }else {
                //5.如果包含,根据字符将对应的value获取出来,让其+1,并重新存入
                Integer value = map.get(key);
                value++;
                map.put(key, value);
            }
        }
        //6.输出map
        System.out.println(map);
    }
}
