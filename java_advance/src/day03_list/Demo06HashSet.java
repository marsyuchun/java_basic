package day03_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by yanyuchun on 2020/4/2
 * Set集合不允许存储重复元素
 *
 */
public class Demo06HashSet {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("安琪拉",38);
        Person p2 = new Person("安琪拉",24);
        Person p3 = new Person("虞姬",25);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        Collections.sort(list);
        System.out.println(list);


    }
}
