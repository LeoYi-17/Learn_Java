package 集合.set集合.LinkedHashSet;

import org.junit.Test;

import java.util.LinkedHashSet;

public class Demo_01_LinkedHashSet {
    @Test
    public void test01(){
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
}
