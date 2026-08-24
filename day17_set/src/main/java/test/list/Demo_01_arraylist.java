package test.list;

import org.junit.Test;

import java.util.ArrayList;

public class Demo_01_arraylist {
    @Test
    public void test01() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
     /*
        如果调用remove方法,直接传递int类型实参,会直接调用根据索引删除元素的remove
        如果调用remove方法,想调用直接删除指定的元素,需要将int型实参装箱
      */
        //list.remove(2);
        list.remove(Integer.valueOf(2));
        System.out.println(list);

    }
}
