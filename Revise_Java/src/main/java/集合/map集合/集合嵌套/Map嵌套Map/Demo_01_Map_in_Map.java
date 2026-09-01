package 集合.map集合.集合嵌套.Map嵌套Map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_01_Map_in_Map {
    @Test
    public void test01(){
        // 小map的key为学号,value为姓名
        // 大map的key为字符串(javase,javaee),value为小map
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");
        HashMap<String,HashMap<Integer,String>> map2 = new HashMap<>();
        map2.put("javase",map1);

        Set<Map.Entry<String, HashMap<Integer, String>>> entries = map2.entrySet();
        for (Map.Entry<String, HashMap<Integer, String>> entry : entries) {
            String bigkey = entry.getKey();
            System.out.println("学科："+bigkey);
            HashMap<Integer, String> smallmap = entry.getValue();
            Set<Map.Entry<Integer, String>> smallEntries = smallmap.entrySet();
            for (Map.Entry<Integer, String> smallEntry : smallEntries) {
                Integer id = smallEntry.getKey();
                String name = smallEntry.getValue();
                System.out.println(id+name);
            }

        }
    }
}
