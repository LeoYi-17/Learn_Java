package test.fanxing;

import org.junit.Test;

import java.util.ArrayList;

public class Demo_01_fanxing {
    @Test
    public void test01() {
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("abc");
        list1.add("haha");
        String element1 = list1.get(0);
        String element2 = list1.get(1);
        System.out.println(element1);
        System.out.println(element2);
    }
    @Test
    public void test02(){
        ArrayList<String> list = new ArrayList<>();
        MyCollections.addAll(list, "小猫", "小狗", "小猪", "小牛", "小羊");
        System.out.println(list);
    }
    @Test
    public void test03(){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
    @Test
    public void test04(){
        MyScanner myScanner = new MyScanner();
        String data = myScanner.next();
        System.out.println(data);
    }
}
