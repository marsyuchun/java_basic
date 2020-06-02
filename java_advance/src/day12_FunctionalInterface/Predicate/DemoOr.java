package day12_FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * Created by yanyuchun on 2020/5/25
 */
public class DemoOr {
    public static void main(String[] args) {
        String s = "java";
        method(s,(m)->m.length()>5,(n)->n.contains("a"));
        method1(s,(m)->m.length()>5,(n)->n.contains("a"));
        method2(s,(n)->n.contains("a"));
        method2(s,(m)->m.length()>5);
    }

    public static void method(String s, Predicate<String> pre1,Predicate<String> pre2   ) {
        boolean test = pre1.or(pre2).test(s);
        System.out.println(test);
    }

    public static void method1(String s, Predicate<String> pre1,Predicate<String> pre2   ) {
        boolean test = pre1.and(pre2).test(s);
        System.out.println(test);
    }

    public static void method2(String s, Predicate<String> pre1) {
        boolean test = pre1.negate().test(s);
        System.out.println(test);
    }
}
