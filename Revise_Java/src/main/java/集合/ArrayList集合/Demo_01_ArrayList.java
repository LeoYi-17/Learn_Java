package 集合.ArrayList集合;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_01_ArrayList {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        // 添加元素到集合中
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        // 删除指定元素
        list.remove("王五");
        System.out.println(list);
        // 删除指定索引上的元素
        String element1 = list.remove(1);
        System.out.println(element1);
        System.out.println(list);
        // 修改指定索引的元素
        String element2 = list.set(0, "熊大");
        System.out.println(element2);
        System.out.println(list);
        // 根据索引获取元素
        System.out.println(list.get(0));
        // 获取元素个数
        System.out.println(list.size());
    }
    @Test
    public void test02(){
        // 迭代器
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
    @Test
    public void test03(){
        // 增强for
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
