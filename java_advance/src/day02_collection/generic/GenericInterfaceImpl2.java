package day02_collection.generic;

import java.util.ArrayList;

/**
 * Created by yanyuchun on 2020/3/31
 */
public class GenericInterfaceImpl2<E> implements GenericInterface<E>{
    ArrayList<E> arr = new ArrayList<>();
    @Override
    public void add(E e) {
        arr.add(e);
    }

    @Override
    public E getE() {
        if (arr.iterator().hasNext()){
            return arr.iterator().next();
        }
        return null;
    }
}
