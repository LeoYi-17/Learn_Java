package com.test.table_vector;

import org.junit.Test;

import java.util.Vector;

public class Demo_02_vector {
    @Test
    public void test01(){
        Vector<String> vector = new Vector<>();
        vector.add("张三");
        vector.add("李四");
        vector.add("王五");
        System.out.println(vector);
        for (String s : vector) {
            System.out.println(s);
        }
        // 指定容量，创建一个长度为10的数组,如果超出了数组容量，每次指定扩容5
        new Vector<String>(10,5);

    }
}
