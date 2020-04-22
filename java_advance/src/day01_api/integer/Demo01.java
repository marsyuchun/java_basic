package day01_api.integer;

/**
 * Created by yanyuchun on 2020/3/27
 * 基本类型的装箱和拆箱
 */
public class Demo01 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Integer n1 = new Integer("76");
        Integer n2 = new Integer(34);
        Integer n3 = Integer.valueOf(4);
        System.out.println(n3);

        System.out.println(n2);
        System.out.println(n1);
        System.out.println(n1.intValue());


    }
}
