package day12_FunctionalInterface.supplier;

import java.util.function.Supplier;

/**
 * Created by yanyuchun on 2020/5/17
 */
public class Demo01Supplier {
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String name = getString(() -> "胡歌");
        System.out.println(name);
    }
}
