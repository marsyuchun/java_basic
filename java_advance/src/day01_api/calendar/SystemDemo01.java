package day01_api.calendar;

/**
 * Created by yanyuchun on 2020/3/23
 */
public class SystemDemo01 {
    public static void main(String[] args) {
        method1();
        method2();

    }

    /**
     * public static native void arraycopy(Object src,  int  srcPos,
     *                                         Object dest, int destPos,
     *                                         int length);
     * 复制数组
     */
    private static void method2() {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {3,4,6,2,66,77,34,8};
        System.arraycopy(arr1,2,arr2,4,2);
        System.out.print("[");
        for (int i = 0; i <arr2.length-1 ; i++) {
            System.out.print(arr2[i]+", ");
        }
        System.out.print(arr2[arr2.length-1]+"]");
    }

    /**
     * public static native long currentTimeMillis();
     * 获取当前系统时间
     */
    private static void method1() {
        long s = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("总计用时"+(e-s)+"毫秒");
    }
}
