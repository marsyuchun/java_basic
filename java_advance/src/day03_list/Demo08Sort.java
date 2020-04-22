package day03_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by yanyuchun on 2020/4/3
 */
public class Demo08Sort {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("安琪拉",38);
        Person p2 = new Person("安琪拉",24);
        Person p3 = new Person("虞姬",25);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        // Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.comparingInt(Person::getAge));
        System.out.println(list);

    }
}
