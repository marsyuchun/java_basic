package day03_list;

import java.util.HashSet;

/**
 * Created by yanyuchun on 2020/4/2
 *  set是一个无序的单列集合
 * Set集合演示
 */
public class Demo03Set {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("h");
        set.add("e");
        set.add("la");
        set.add("l");
        set.add("o");
        System.out.println(set);
    }
}
