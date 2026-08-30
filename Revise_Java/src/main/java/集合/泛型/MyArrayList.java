package 集合.泛型;

import java.util.Arrays;

public class MyArrayList <E>{
    private Object[]arr = new Object[10];
    private int size = 0;
    public void add(E e){
        arr[size] = e;
        size++;
    }
    public E get(int index){
        // 定义get方法用于根据索引获取元素
        return (E) arr[index];
    }
    public String toString(){
        return Arrays.toString(arr);
    }
}
