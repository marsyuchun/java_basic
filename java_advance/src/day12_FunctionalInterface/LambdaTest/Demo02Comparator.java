package day12_FunctionalInterface.LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yanyuchun on 2020/5/9
 */
public class Demo02Comparator {
    public static Comparator<String> compare2Num() {

        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"abc","zero","ab","aa"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,compare2Num());
        System.out.println(Arrays.toString(arr));

    }
}
