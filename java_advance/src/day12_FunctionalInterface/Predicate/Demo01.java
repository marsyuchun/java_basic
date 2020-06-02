package day12_FunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * Created by yanyuchun on 2020/5/25
 */
public class Demo01 {
    public static void main(String[] args) {
        String s= "Hello World!";
        method((n)-> n.length()>5,s);
    }

    public static void method(Predicate<String> pre,String s){
        boolean hello = pre.test(s);
        System.out.println("字符串长度大于5："+hello);
    }
}
