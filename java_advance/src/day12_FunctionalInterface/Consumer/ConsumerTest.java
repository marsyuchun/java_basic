package day12_FunctionalInterface.Consumer;

import java.util.function.Consumer;

/**
 * Created by yanyuchun on 2020/5/18
 */
public class ConsumerTest {
    public static void main(String[] args) {
        String[] arrays = {"黄忠,70", "关羽,40", "张飞,38", "马超,36", "赵云,32"};
        method(arrays,(s)-> System.out.print("姓名:"+s.split(",")[0]),(s)-> System.out.println(".年龄-"+s.split(",")[1]));
    }

    public static void method(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }


}
