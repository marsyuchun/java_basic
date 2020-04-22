package day02_collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yanyuchun on 2020/3/31
 */
public class Generic03Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(1);
        ai.add(11);
        ai.add(13);
        method02(ai);


        ArrayList<String> as = new ArrayList<>();
        as.add("刘备");
        as.add("孙权");
        as.add("曹操");

        method02(as);
    }

    private static void method02(ArrayList<?> as) {
        Iterator<?> it = as.iterator();
        while (it.hasNext()){
            Object next = it.next();
            System.out.println(next);
        }
    }

    private static <E> void method01(ArrayList<E> arr) {
        Iterator<E> it = arr.iterator();
        while (it.hasNext()) {
            E next = it.next();
            System.out.println(next);
        }
    }


}

