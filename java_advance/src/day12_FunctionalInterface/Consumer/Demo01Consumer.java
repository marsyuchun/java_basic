package day12_FunctionalInterface.Consumer;

import java.util.function.Consumer;

/**
 * Created by yanyuchun on 2020/5/17
 */
public class Demo01Consumer {
    public static void main(String[] args) {
//        method("李白", (String name) -> {
//            // 消费方式：直接输出字符串
//            System.out.println(name);
//        });
        String Name = "李白";
        method(Name, (String name) -> {
            // 消费方式：字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
        System.out.println(Name);


    }

    public static void method(String s, Consumer<String> consumer) {
        consumer.accept(s);
    }

}
