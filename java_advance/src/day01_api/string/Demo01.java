package day01_api.string;

/**
 * Created by yanyuchun on 2020/3/23
 */
public class Demo01 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        method1();
        long e = System.currentTimeMillis();
        System.out.println(e - s);
        method2();
    }

    private static void method2() {
        int[] arr1 ={1,223,443,5,222,343,543,55,6,90};
        int[] arr2 = {2,3,45,33,45};
        System.arraycopy(arr1,2,arr2,1, 5);
        System.out.print("[");
        for (int i = 0; i <arr2.length-1 ; i++) {
            System.out.print(arr2[i]+", ");
        }
        System.out.print(arr2[arr2.length-1]+"]");
    }

    /**
     * 使用传统方式创建字符串
     */
    private static void method1() {
        String s = "";
        for (int i = 0; i < 100; i++) {
            s = s + "sa";
        }
        System.out.println(s);
    }


}
