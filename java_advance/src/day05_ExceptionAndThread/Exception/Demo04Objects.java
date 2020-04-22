package day05_ExceptionAndThread.Exception;

import java.util.Objects;

/**
 * Created by yanyuchun on 2020/4/8
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method(111);
//        method(null);
        String s = " aAzZ ";
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            int c = s.charAt(i);
            System.out.println(c);
        }

        System.out.println(trim(s));

    }

    public static void method(Object obj){
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象值为nulls");
    }

    public static String trim(String value) {
        int len = value.length();
        int st = 0;
        char[] val = value.toCharArray();    /* avoid getfield opcode */

        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < value.length())) ? value.substring(st, len) : value;
    }
}
