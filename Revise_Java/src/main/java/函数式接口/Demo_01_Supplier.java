package 函数式接口;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo_01_Supplier {
    public static void main(String[] args) {
        // 从小到大升序排序，排序完成之后，返回最大的数
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int[] arr = {5,34,4,5,76,7};
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        });
        System.out.println("————————————");
        method(()->{
            int[] arr = {5,34,4,5,76,7};
            Arrays.sort(arr);
            return arr[arr.length-1];
        });
    }
    public static void method(Supplier <Integer> supplier){
        System.out.println(supplier.get());
    }
}
