package demo01;

import java.util.Arrays;

/**
 * Created by yanyuchun on 2020/5/17
 */

/*
    给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
    如果不能形成任何面积不为零的三角形，返回 0。
    例如：
    输入：[3,2,3,4]
    输出：10
 */
public class LargestTrianglePerimeter {
    public static void main(String[] args) {
        int[] a = {3, 2, 3, 4};
        System.out.println(Arrays.toString(a));
        int perimeter = largestPerimeter(a);
        if (perimeter > 0) {
            System.out.println("最大的周长为：" + perimeter);
        } else {
            System.out.println("不满足构成三角形，周长为：" + perimeter);
        }


    }

    public static int largestPerimeter(int[] A) {
        if (A.length < 3){
            return 0;
        }
        Arrays.sort(A);
        for (int i = A.length - 1;i >= 2; i--){
            if (isTriangle(A[i],A[i-1],A[i-2])){
                return A[i] + A[i-1] + A[i-2];
            }
        }
        return 0;
    }

    static boolean isTriangle(int a, int b, int c){
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            return true;
        }
        return false;
    }

}
