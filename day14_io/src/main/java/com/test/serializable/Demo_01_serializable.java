package com.test.serializable;

import java.io.*;

public class Demo_01_serializable {
    public static void main(String[] args) throws Exception {
        //writer();
       reader();
    }

    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day14_io/person.txt"));
        Person p1 = new Person("张三", 18);
        oos.writeObject(p1);
        oos.close();
    }
    private static void reader()throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day14_io/person.txt"));
        Object o = ois.readObject();
        // 强制向下转型：Object → Person
        Person p = (Person) o;
        System.out.println(p);
        ois.close();
    }
}
