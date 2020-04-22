package day03_list;

import java.util.LinkedList;

/**
 * Created by yanyuchun on 2020/4/1
 *
 * java.util.LinkedList集合 implements List接口
 * LinkedList集合特点：
 * 1、底层是一个链表，查询慢，增删快
 * 2、里面包含大量操作首尾元素的方法
 * 注意：使用LinkedList特有的方法，不能使用多态
 *
 *
 *
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("a");

        System.out.println(linked);

        linked.push("first");
        System.out.println(linked);
        linked.addLast("last");
        System.out.println(linked);
        
//        linked.clear();
        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            System.out.println(first);
        }

        System.out.println(linked);
        linked.pop();
        System.out.println(linked);



    }

}
