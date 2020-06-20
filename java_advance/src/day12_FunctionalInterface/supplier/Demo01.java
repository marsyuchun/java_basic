package day12_FunctionalInterface.supplier;

import java.util.function.Supplier;

/**
 * Created by yanyuchun on 2020/5/17
 */
/*
 Supplier 接口被称为生产型接口
 */
public class Demo01 {
    public static void main(String[] args) {
        String str = getString(() ->{
            String s = new String("Hello World");
            return  s;
        });
        System.out.println(str);
    }

    // 定义一个方法，方法的参数传递Suppiler
    public static String getString(Supplier<String > sp) {
        return sp.get();
    }
}
