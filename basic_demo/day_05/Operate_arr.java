package basic_demo.day_05;

public class Operate_arr {
    public static void compareMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }
        System.out.println("数组中最大的数为：" + max);
    }

    public static void reversal(int[] a) {
        int l = a.length;
        int[] b = new int[l];
        for (int i = 0; i < l; i++) {
            b[i] = a[l - i - 1];
        }
        System.out.println("反转后的结果为：");
        for (int i = 0; i < l; i++) {
            if (i == l - 1) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + ",");
            }
        }
    }

    public static void change(int a, int b) {
        a=a+b;
        b=b+a;
        System.out.println(a);
        System.out.println(b);
    }

    public static void change1(int[] arr) {
        arr[0] = 200;
    }

    public static void main(String[] args) {
        int[] arr = {1,23,33,2,56,99,98,25,99};
        compareMax(arr);
        reversal(arr);
        change(2,3);


        int[] arr1 = {1, 3, 5};
        System.out.println(arr1[0]);
        change1(arr1);
        System.out.println(arr1[0]);
    }
}
