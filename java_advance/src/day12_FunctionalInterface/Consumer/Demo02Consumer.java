package day12_FunctionalInterface.Consumer;

import java.util.function.Consumer;

/**
 * Created by yanyuchun on 2020/5/18
 */
/*
   Consumer接口的默认方法andThen
   作用：需要两个Consumer接口，可以把两个Consumer接口组合在一起，对数据进行消费

   例如：
    Consumer<String> con1
    Consumer<String> con2
    String s = "hello";
    con1.accept(s) ;
    con2.accept(s);

    使用andThen优化后
    con1.andThen(con2).accept(s);

 */
public class Demo02Consumer {
    public static void main(String[] args) {

    method("hello",(t)->{
                System.out.println(t.toUpperCase());
            },
            (t)->{
                System.out.println(t.toLowerCase());
            });

    }
    // 定义一个方法，参数传递一个字符串和两个Consumer接口
    public static void method(String s , Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);

    }


}
