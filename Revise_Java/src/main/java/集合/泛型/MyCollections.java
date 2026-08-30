package 集合.泛型;

import java.util.ArrayList;

public class MyCollections {
    private MyCollections(){

    }

    public static <E> void addAll(ArrayList<E> list, E... elements){
        for (E e : elements) {
            list.add(e);
        }
    }
}
