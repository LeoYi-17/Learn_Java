package 集合.map集合.TreeSet;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo_01_TreeSet {
    @Test
    public void test01() {
        TreeSet<String> set = new TreeSet<>();
        set.add("b.曲项向天歌");
        set.add("a.鹅鹅鹅");
        set.add("d.红掌拨清波");
        set.add("c.白毛浮绿水");
        System.out.println(set);
    }
    @Test
    public void test02(){
        TreeSet<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        set.add(new Person("张三", 28));
        set.add(new Person("李四", 19));
        set.add(new Person("王五", 20));
        System.out.println(set);
    }
}
