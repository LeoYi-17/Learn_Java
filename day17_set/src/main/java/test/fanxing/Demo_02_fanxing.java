package test.fanxing;

import org.junit.Test;

import java.util.ArrayList;

public class Demo_02_fanxing {
    @Test
    public void test01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("小猫");
        list.add("小狗");
        list.add("小猪");
        list.add("小牛");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        method(list);
        method(list2);
    }

    public void method(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
