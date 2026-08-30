package 集合.Collection接口;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class Demo_01_Collection {
    @Test
    public void test01(){
        // 给定的元素添加到当前集合中
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("张玉宁");
        collection1.add("张家鸣");
        collection1.add("张琳芃");
        System.out.println(collection1);
        System.out.println("——————————————————————————————————————————————");
        // 将另一个集合元素添加到当前集合中
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("王钰栋");
        collection2.add("王上源");
        collection2.add("王博豪");
        collection1.addAll(collection2);
        System.out.println(collection1);
        System.out.println("——————————————————————————————————————————————");
        // 清除集合中所有元素
        collection2.clear();
        System.out.println(collection2);
        System.out.println("——————————————————————————————————————————————");
        // 判断当前集合中是否包含指定的元素
        System.out.println(collection1.contains("张玉宁"));
        System.out.println("——————————————————————————————————————————————");
        // 判断集合是否为空
        System.out.println(collection2.isEmpty());
        System.out.println("——————————————————————————————————————————————");
        // 将指定的元素从集合中删除
        collection1.remove("张琳芃");
        System.out.println(collection1);
        System.out.println("——————————————————————————————————————————————");
        // 返回集合中的元素个数
        System.out.println(collection1.size());
        System.out.println("——————————————————————————————————————————————");
        // 把集合中的元素,存储到数组中
        Object[] array = collection1.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
    }
}
