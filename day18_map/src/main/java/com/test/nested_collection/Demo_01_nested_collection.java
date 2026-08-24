package com.test.nested_collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_01_nested_collection {
    @Test
    public void test01(){
        // 创建2个List集合,每个集合中分别存储一些字符串,将2个集合存储到第3个List集合中
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("王五");
        list2.add("赵六");

        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        for (ArrayList<String> arraylist : lists) {
            for (String s : arraylist) {
                System.out.println(s);
            }
        }
    }
    @Test
    public void test02(){
        // 1班级有三名同学，学号和姓名分别为：1=张三，2=李四，3=王五，2班有三名同学，
        // 学号和姓名分别为：1=黄晓明，2=杨颖，3=刘德华,
        // 请将同学的信息以键值对的形式存储到2个Map集合中，再将2个Map集合存储到List集合中。
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "张三");
        map1.put(2, "李四");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "王五");
        map2.put(4, "赵六");

        ArrayList<HashMap<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);

        for (HashMap<Integer, String> Map : list) {
            Set<Map.Entry<Integer, String>> set = Map.entrySet();
            for (Map.Entry<Integer, String> entry : set) {
                // 获取Map集合中的键值对,转存到Set集合中
                System.out.println(entry.getKey()+entry.getValue());
            }
        }
    }
    @Test
    public void test03(){
        // 小map的key为学号,value为姓名
        // 大map的key为字符串(javase,javaee),value为小map

        //小map：学号=姓名
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");
        map1.put(3,"王五");

        //大map：key是分类名称，value是小map
        HashMap<String, HashMap<Integer, String>> map2 = new HashMap<>();
        map2.put("javase", map1);  //把小map放进大map

        //第一步：获取大map所有键值对
        Set<Map.Entry<String, HashMap<Integer, String>>> entries = map2.entrySet();

        //外层循环：遍历大map
        for (Map.Entry<String, HashMap<Integer, String>> entry : entries) {
            //大map的key
            String bigKey = entry.getKey();
            // 重点：getValue()拿到【里面嵌套的小map】
            System.out.println("分类："+ bigKey);

            //内层循环：遍历这个小map！
            HashMap<Integer, String> smallMap = entry.getValue();
            Set<Map.Entry<Integer, String>> smallEntries = smallMap.entrySet();
            for(Map.Entry<Integer,String> smallEntry : smallEntries){
                Integer id = smallEntry.getKey();     //学号
                String name = smallEntry.getValue(); //姓名
                System.out.println("    "+id +" → "+ name);
            }
        }
    }
}
