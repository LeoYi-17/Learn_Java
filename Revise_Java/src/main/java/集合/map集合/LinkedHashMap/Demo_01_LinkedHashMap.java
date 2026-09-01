package 集合.map集合.LinkedHashMap;

import org.junit.Test;

import java.util.LinkedHashMap;

public class Demo_01_LinkedHashMap {
    @Test
    public void test01() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("2", "王五");
        map.put("5", "朱八");
        map.put("4", "田七");
        map.put("3", "赵六");
        System.out.println(map);
    }
}
