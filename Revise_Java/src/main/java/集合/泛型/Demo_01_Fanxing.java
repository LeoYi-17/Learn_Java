package 集合.泛型;

import org.junit.Test;

import java.util.ArrayList;

public class Demo_01_Fanxing {
    @Test
    public void test01(){
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("张三");
        myArrayList.add("李四");
        String s1 = myArrayList.get(0);
        String s2 = myArrayList.get(1);
        System.out.println(s1);
        System.out.println(s2);
    }
    @Test
    public void test02() {
        ArrayList<String> list = new ArrayList<>();
        MyCollections.addAll(list, "小猫", "小狗", "小猪", "小牛", "小羊");
        System.out.println(list);
    }
    @Test
    public void test03() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
    @Test
    public void test04() {
        MyScanner myScanner = new MyScanner();
        String data = myScanner.next();
        System.out.println(data);
    }
    @Test
    public void test05() {
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
