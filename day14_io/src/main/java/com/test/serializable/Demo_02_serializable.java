package com.test.serializable;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo_02_serializable {
    public static void main(String[] args)throws Exception {
        //writer();
        reader();
    }

    private static void reader()throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day14_io/person.txt"));
        /*Object o = ois.readObject();
        Object o1 = ois.readObject();
        Object o2 = ois.readObject();
        Object o3 = ois.readObject();
        Person p = (Person) o;
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        Person p3 = (Person) o3;
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);*/

        Object o = ois.readObject();
        ArrayList<Person> list = (ArrayList<Person>) o;
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }

    private static void writer() throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("day14_io/person.txt"));
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 20);
        Person p3 = new Person("王五", 22);

        //创建一个集合ArrayList
        ArrayList<Person> list = new ArrayList<>();
        //调用add方法将三个对象放到集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);

        oos.writeObject(list);
        //oos.writeObject(p1);
        //oos.writeObject(p2);
        //oos.writeObject(p3);
        oos.close();
    }
}
