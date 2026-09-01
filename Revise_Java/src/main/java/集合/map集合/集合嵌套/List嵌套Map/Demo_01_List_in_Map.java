package 集合.map集合.集合嵌套.List嵌套Map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_01_List_in_Map {
    @Test
    public void test01(){
        /*1班级有三名同学，学号和姓名分别为：1=张三，2=李四，3=王五，
        2班有三名同学，学号和姓名分别为：1=黄晓明，2=杨颖，3=刘德华,
        请将同学的信息以键值对的形式存储到2个Map集合中，再将2个Map集合存储到List集合中。*/
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        map1.put(1,"张三");
        map1.put(2,"李四");
        map2.put(3,"王五");
        map2.put(4,"赵六");

        ArrayList<HashMap<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);

        for (HashMap<Integer, String> map : list) {
            Set<Map.Entry<Integer, String>> set = map.entrySet();
            for (Map.Entry<Integer, String> entry : set) {
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
}
