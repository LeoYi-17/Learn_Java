package com.test.array;
import cn.hutool.core.util.ArrayUtil;
public class Demo_06_ArrayHutool {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        //int max(数组)返回数组最大值
        System.out.println(ArrayUtil.max(array));
        //int indexOf(数组,要查找的数据)顺序查找,指定的数据在数组中的位置
        System.out.println(ArrayUtil.indexOf(array,2));
        //reverse()数组翻转
        ArrayUtil.reverse(array);
        //这个toString不是Arrays中的,而是Hutool工具的ArrayUtil中的
        System.out.println(ArrayUtil.toString(array));
    }
}
