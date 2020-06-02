package day13_Stream.ArrayMethodReference;

import java.util.Arrays;

/**
 * Created by yanyuchun on 2020/6/1
 * 数组的构造器引用
 */
public class Demo {
    /*
    定义一个方法
    方法的参数传递创建数组的长度和ArrayBuilder接口
     */
    public static int[] createArray(int len, ArrayBuilder arrayBuilder) {
        return arrayBuilder.builderArray(len);
    }


    public static void main(String[] args) {
//        int[] array = createArray(5, (len) -> {
//            return new int[len];
//        });
//        System.out.println(array.length);

        /*
            使用方法引用优化lambda表达式
            已知创建的就是int[]数组
            数组的长度也是已知的
            就可以使用方法引用
            int[] 引用new
         */
        int[] array = createArray(10, int[]::new);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
    }
}
