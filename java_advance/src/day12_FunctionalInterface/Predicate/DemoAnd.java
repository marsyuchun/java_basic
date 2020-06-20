package day12_FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * Created by yanyuchun on 2020/5/25
 */
public class DemoAnd {
    public static void main(String[] args) {
        String s = "Hello java";
        method((m) -> m.length() > 5, (n) -> n.contains("a"), s);
        method1((m) -> m.length() > 5, (n) -> n.contains("b"), s);


    }

    public static void method(Predicate<String> pre1, Predicate<String> pre2, String s) {
        boolean test1 = pre1.test(s);
        boolean test2 = pre2.test(s);
        System.out.println(test1 && test2);
    }

    public static void method1(Predicate<String> pre1, Predicate<String> pre2, String s) {
        boolean test = pre1.and(pre2).test(s);
        System.out.println(test);
    }


}
