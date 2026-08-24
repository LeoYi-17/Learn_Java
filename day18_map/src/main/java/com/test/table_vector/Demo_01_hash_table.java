package com.test.table_vector;

import org.junit.Test;

import java.util.Hashtable;

public class Demo_01_hash_table {
    @Test
    public void test01(){
        Hashtable<String, String> table = new Hashtable<>();
        table.put("1", "张三");
        table.put("2", "李四");
        table.put("3", "王五");
        //table.put(null,null);
        System.out.println(table);
    }
}
