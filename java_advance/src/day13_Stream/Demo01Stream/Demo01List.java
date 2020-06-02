package day13_Stream.Demo01Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanyuchun on 2020/5/26
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("刘禅");
        list.add("刘备");
        list.add("李白");
        list.add("武则天");
        list.add("虞姬");

        // 对集合进行过滤，把刘开头的人存入到listA
        List<String > listA = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("刘")) {
                listA.add(s);
            }
        }



    }
}
