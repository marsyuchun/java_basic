package day13_Stream.Demo01Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanyuchun on 2020/5/26
 */
/*
    Stream流是JDK1.8之后出现的
    关注的是做什么，而不是怎么做
 */
public class Demo02Stream {
    public static void main(String[] args) {
        // 创建一个List集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("刘禅");
        list.add("刘备");
        list.add("李白");
        list.add("武则天");
        list.add("虞姬");
        list.add("刘禹锡");

        list.stream()
                .filter(name -> name.startsWith("刘"))
                .filter(name -> name.length() == 2)
                .forEach(name-> System.out.println(name));

        list.stream()
                .map(name->name.toUpperCase()+" age")
                .forEach(name-> System.out.println(name));
    }

}
