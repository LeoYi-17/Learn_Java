package test.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo_01_set {
    @Test
    public void test01(){
        HashSet<String> set = new HashSet<>();
        set.add("小猫");
        set.add("小狗");
        set.add("小猪");
        set.add("小牛");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
    @Test
    public void test02(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("小猫");
        set.add("小狗");
        set.add("小猪");
        set.add("小牛");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
    @Test
    public void test03(){
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println("================");
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("================");
        String s3 = "通话";
        String s4 = "重地";
        System.out.println(s3.hashCode());//1179395
        System.out.println(s4.hashCode());//1179395
    }
    @Test
    public void test04() {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("通话");
        set.add("重地");
        set.add("abc");
        System.out.println(set);//[通话, 重地, abc]
    }
    @Test
    public void test05(){
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("张三", 18));
        set.add(new Person("张三", 18));
        set.add(new Person("张三", 19));
        System.out.println(set);
    }
}
