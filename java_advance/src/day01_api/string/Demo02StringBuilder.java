package day01_api.string;

import java.util.Arrays;

/**
 * Created by yanyuchun on 2020/3/23
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        method4();
        method5();

    }

    private static void method5() {
        char[] c = {'h','e','l','l','o'};
        char[] chars = Arrays.copyOf(c,1);
        System.out.println(chars);

    }


    // 创建String
    private static void method4() {
        char[] ch = {'d','a','c','e'};
        String s = new String(ch);
        System.out.println(s);
    }

    /**
     * StringBuilder -> String
     */
    private static void method3() {

        // StringBuilder -> String
        String str ="hello";
        System.out.println("str:"+str);
        StringBuilder bu =new StringBuilder(str);
        bu.append(" world");
        System.out.println("bu:"+bu);

        // String -> StringBuilder

    }

    /**
     * StringBuilder 的成员方法
     * public
     */
    private static void method2() {
        StringBuilder bu1 = new StringBuilder();
        StringBuilder bu2 = bu1.append("long");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1 == bu2);

        // 使用append方法无需接受返回值，可以使用链式编程
        bu1.append("my ").append("name ").append("is ").append("kevin");
        System.out.println(bu1);
    }


}
