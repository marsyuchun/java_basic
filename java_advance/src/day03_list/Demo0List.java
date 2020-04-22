package day03_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yanyuchun on 2020/4/1
 */
public class Demo0List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");

        System.out.println(list);
        list.add(6,"ff");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
