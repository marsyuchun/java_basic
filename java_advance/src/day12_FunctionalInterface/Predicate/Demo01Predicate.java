package day12_FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * Created by yanyuchun on 2020/5/19
 */
/*
    predicate 测试接口
 */
public class Demo01Predicate {
    public static void main(String[] args) {
        String a = "10";
        boolean b = checkString(a, (String s) -> s.length()>5);

        System.out.println(b);
    }

    /*
        定义一个方法
        参数传递一个String类型的字符串

     */
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }
}
