package com.test.private_;

public class Person {
    //隐藏细节
    private String name;
    private int age;
    /**
     * 对外提供公共的接口
     */

    /**
     * 为私有化的name提供公共的接口
     * setName()和getName()
     */
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    /**
     * 为私有化的age提供公共的接口
     * setAge()和getAge()
     */
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
