package 集合.map集合.集合嵌套.List嵌套List;

import org.junit.Test;

import java.util.ArrayList;

public class Demo_01_List_in_List {
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
        for (ArrayList<String> list : lists) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
