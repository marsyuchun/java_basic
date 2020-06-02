package day12_FunctionalInterface.Function;

import java.util.function.Function;

/**
 * Created by yanyuchun on 2020/5/25
 */
public class DemoTest {
    /*
        1、将字符串截取数字年龄部分，得到字符串;
        2. 将上一步的字符串转换成为int类型的数字;
        3. 将上一步的int数字累加100，得到结果int数字。
     */
    public static void change(String s, Function<String,String> fun1,Function<String,Integer> fun2){
        Integer apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        change(str,s->s.split(",")[1],s1 -> Integer.parseInt(s1)+2);
    }
}
