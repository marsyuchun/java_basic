package day01_api.integer;

/**
 * Created by yanyuchun on 2020/3/27
 * 基本类型与字符串之间的转化
 * 基本类型-->字符串
 *  1、基本类型数据直接+""
 *  2、使用包装类中的静态方法
 *      static String toString(int i)
 *  3、使用String类中的静态方法
 *      static String valueOf(int i)
 *
 *  字符串-->基本类型
 *  使用包装类型的parseXX(字符串)
 *  static int parseInt(String s)
 */
public class Demo03 {
    public static void main(String[] args) {
        // 基本类型-->字符串
        // method1();
        method2();

    }

    private static void method2() {
        String s = "100";
        int in1 = Integer.parseInt(s);
        System.out.println(in1+200);
    }

    private static void method1() {
        String s = 100 + "";
        System.out.println(s);
        String in2 = Integer.toString(45);
        System.out.println(in2+45);
        String s1 = String.valueOf(100);
        System.out.println(s1+200);
    }


}
