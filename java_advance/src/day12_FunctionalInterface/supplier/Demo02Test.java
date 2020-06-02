package day12_FunctionalInterface.supplier;

import java.util.function.Supplier;

/**
 * Created by yanyuchun on 2020/5/17
 */
public class Demo02Test {

    public static void main(String[] args) {
        int[] arr = {100,50,22,2000,3990};
        int max1 = getMax(() -> {
            int num = arr[0];
            for (int i = 0; i <arr.length ; i++) {
                if (num < arr[i]){
                    num = arr[i];
                }
            }
            return num;
        });
        System.out.println("最大值为:"+max1);

        int max = getMax(() -> {
            // 获取数组的最大值并返回
            int m=arr[0];
            for (int i : arr) {
                if (i>m){
                    m=i;
                }
            }
            return m;
        });
        System.out.println(max);
    }

    public static int getMax(Supplier<Integer> num){
        return num.get();
    }
}
