package day02_collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yanyuchun on 2020/3/31
 */
public class Demo0Generic {
    public static void main(String[] args) {
        method1();

    }

    /**
     * 定义集合不使用泛型
     * 好处：
     * 1、类型为Object，可以在集合中添加任意类型
     * 坏处：
     * 1、类型转换会报错
     */
    private static void method2() {
        ArrayList arr =new ArrayList();
        arr.add("孙尚香");
        arr.add(28);
        Iterator it = arr.iterator();
        while (it.hasNext()){
            Object next = it.next();
            String s = (String) next;
            System.out.println(s.length());
        }

    }

    /* 定义集合使用泛型
     * 好处：
     * 1、不需要额外的进行类型转换
     * 2、把运行时报错提升到编译时报错
     * 坏处：
     * 1、泛型时什么，就只能存储什么类型
     */
    private static void method1() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("不知火舞");
        arr.add("甄姬");
//        arr.add(3);
        Iterator<String> it = arr.iterator();

        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }


    }
}
