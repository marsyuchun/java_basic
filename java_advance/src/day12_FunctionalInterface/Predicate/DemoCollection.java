package day12_FunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by yanyuchun on 2020/5/25
 */
public class DemoCollection {
    public static void main(String[] args) {
        String[] arr = {"小乔,女", "李白,男", "武则天,女", "甄姬,女", "西施,女", "虞姬,女", "项羽,女"};
        ArrayList<String> newList = filter(arr, s -> s.split(",")[0].length() == 2, s -> s.split(",")[1].equals("女"));
        System.out.println(newList);
    }

    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (pre1.and(pre2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }
}
