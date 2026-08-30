package 集合.Collections集合工具类;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo_01_Collections {
    @Test
    public void test01(){
        ArrayList<String> list = new ArrayList<>();
        // 批量添加元素
        Collections.addAll(list, "小猫", "小狗", "小猪", "小牛", "小羊");
        System.out.println(list);
        // 将集合中的元素顺序打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
    @Test
    public void test02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("b.疑是地上霜");
        list.add("a.床前明月光");
        list.add("c.举头望明月");
        list.add("d.低头思故乡");
        // 按照默认规则排序
        Collections.sort(list);
        System.out.println(list);
    }
    @Test
    public void test03(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",16));
        list.add(new Person("王五",20));
        // 升序排序
        Collections.sort(list,((o1, o2) -> o1.getAge()-o2.getAge()));
        System.out.println(list);
    }
    @Test
    public void test04(){
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students("张三",89));
        list.add(new Students("李四",94));
        list.add(new Students("王五",78));
        Collections.sort(list);
        System.out.println(list);
    }
    @Test
    public void test05(){
        List<String> list = Arrays.asList("小猫", "小狗", "小猪", "小牛", "小羊");
        System.out.println(list);
        // 使用此方法批量添加之后不要修改集合长度了,因为底层是一个数组,数组被final定死了
        /*list.add("小马");
        System.out.println(list);*/
    }
}
