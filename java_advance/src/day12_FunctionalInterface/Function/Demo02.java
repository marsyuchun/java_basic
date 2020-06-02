package day12_FunctionalInterface.Function;

import java.util.function.Function;

/**
 * Created by yanyuchun on 2020/5/25
 */
public class Demo02 {
    /*
    把String类型的"123",转换为Integer类型，并把转换后的结果加上10，
    再把增加之后的Integer转换为String
     */
    public static void change(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
//        int in = fun1.apply(s)+10;
//        String apply = fun2.apply(in);
        String apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);

    }

    public static void main(String[] args) {
        String s = "8899";
        change(s,s1->(Integer.parseInt(s)+10), s2->s2.toString());
    }


}
