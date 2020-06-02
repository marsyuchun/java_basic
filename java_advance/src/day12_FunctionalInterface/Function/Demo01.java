package day12_FunctionalInterface.Function;

import java.util.function.Function;

/**
 * Created by yanyuchun on 2020/5/25
 */
public class Demo01 {
    /*
    定义一个方法
    方法的参数传递一个字符串类型的整数
    方法的参数传递一个Function接口，泛型使用<String ,Integer>
    使用Function接口中的方法apply，把字符串类型的整数，转换为Integer类型的整数
     */
    public static void change(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        // 可以使用自动拆箱，使用int
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s, str -> Integer.parseInt(str));

    }


}
