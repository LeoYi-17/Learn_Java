package com.test.construct;

public class Person {
    private String name;
    private int age;

    /**
     * 空参构造
     */
    public Person(){
        //System.out.println("空参构造");
    }

    /**
     * 带参构造
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
