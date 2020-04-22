package day02_collection.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by yanyuchun on 2020/3/31
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 * 有两个常用方法
 * public E next():返回迭代的下一个元素。
 * public boolean hasNext():如果仍有元素可以迭代，则返回 true。
 */
public class IteratorDemo01 {
    public static void main(String[] args) {
        Collection<String> cs = new ArrayList<>();
        cs.add("亚瑟");
        cs.add("不知火舞");
        cs.add("狄仁杰");
        cs.add("荆轲");
        cs.add("虞姬");
        Iterator<String> it = cs.iterator();

        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);

        }
        System.out.println("-------------------");
        for (String name : cs) {
            System.out.println(name);
        }
    }
}
