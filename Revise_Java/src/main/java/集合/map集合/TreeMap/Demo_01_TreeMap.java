package 集合.map集合.TreeMap;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo_01_TreeMap {
    @Test
    public void test01() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("b","曲项向天歌");
        map.put("a","鹅鹅鹅");
        map.put("d","红掌拨清波");
        map.put("c","白毛浮绿水");
        System.out.println(map);
    }
    @Test
    public void test02(){
        TreeMap map = new TreeMap<Person,String>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        map.put(new Person("张三", 18), "杭州");
        map.put(new Person("李四", 19), "上海");
        map.put(new Person("王五", 20), "北京");
        System.out.println(map);
    }
}
