package 集合.set集合.HashSet;

import org.junit.Test;

import java.util.HashSet;

public class Demo_01_HashSet {
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
}
