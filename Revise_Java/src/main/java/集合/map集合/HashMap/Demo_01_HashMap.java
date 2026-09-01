package 集合.map集合.HashMap;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_01_HashMap {
    @Test
    public void test01(){
        HashMap<String, String> map = new HashMap<>();
        // 添加元素
        map.put("1","张三");
        map.put("2","李四");
        map.put("2", "王五");
        map.put("3", "赵六");
        map.put("4", "田七");
        map.put("5", "朱八");
        System.out.println(map);
        // 删除元素
        String s = map.remove("1");
        System.out.println(s);
        System.out.println(map);
        // 获取元素
        System.out.println(map.get("2"));
        // 判断元素是否包含指定的key
        boolean b = map.containsKey("3");
        System.out.println(b);
        // 获取集合中所有的value,转存到Collection集合中
        Collection<String> collection = map.values();
        System.out.println(collection);
    }
    @Test
    public void test02(){
        // HashMap遍历
        HashMap<String, String> map = new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key+value);
        }
    }
    @Test
    public void test03(){
        // HashMap遍历
        HashMap<String, String> map = new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }
    }
    @Test
    public void test04() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("张三", 18), "重庆");
        map.put(new Person("李四", 20), "济南");
        map.put(new Person("王五",22), "长沙");
        map.put(new Person("赵六",16),"辽宁");
        map.put(new Person("赵六",16),"北京");
        System.out.println(map);
    }
    @Test
    public void test05(){
        /*需求:用Map集合统计字符串中每一个字符出现的次数
        步骤:
        1.指定一个字符串
        2.创建一个map集合,key指定为String代表字符,value为Integer代表字符个数
        3.遍历字符串,用每一个字符去判断,Map中是否包含字符
        4.如果不包含,将字符和1存到map中
        5.如果包含,根据字符将对应的value获取出来,让其+1,并重新存入
        6.输出map*/
        String s = "abcdefg";
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            String key = c + "";
            if(!map.containsKey(key)){
                map.put(key,1);
            }else {
                Integer value = map.get(key);
                value++;
                map.put(key,value);
            }
        }
        System.out.println(map);

    }
}
