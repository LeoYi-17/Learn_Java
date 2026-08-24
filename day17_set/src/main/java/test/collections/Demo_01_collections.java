package test.collections;

import org.junit.Test;

import java.util.*;

public class Demo_01_collections {
    @Test
    public void test01() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "小猫", "小狗", "小猪", "小牛", "小羊");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }

    @Test
    public void test02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("b.疑是地上霜");
        list.add("a.床前明月光");
        list.add("c.举头望明月");
        list.add("d.低头思故乡");
        Collections.sort(list);
        System.out.println(list);
    }
    @Test
    public void test03(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",19));
        list.add(new Person("李四",16));
        list.add(new Person("王五",20));
        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //升序
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);*/

        Collections.sort(list, (o1,o2)-> o1.getAge()-o2.getAge());
        System.out.println(list);
    }
    @Test
    public void test04(){
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students("张三",89));
        list.add(new Students("李四",96));
        list.add(new Students("王五",78));
        Collections.sort(list);
        System.out.println(list);
    }
    @Test
    public void test05() {
        List<String> list = Arrays.asList("小猫", "小狗", "小猪", "小牛", "小羊");
        System.out.println(list);
        list.add("小马");
        System.out.println(list);
    }
}
