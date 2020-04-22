package day03_list;

/**
 * Created by yanyuchun on 2020/4/2
 *
 * 哈希值：一个十进制整数，由系统随机给出（逻辑地址），不是实际地址
 * hashCode方法的源码：
 *      public native int hashCode();
 *      native：代表方法调用的是本地操作系统的方法
 */
public class Demo05HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h = p1.hashCode();
        System.out.println(p1);
        System.out.println(h);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(p2);
        System.out.println(h2);

        ten2Six(h2);

        // String 类的hashCode
        String s1 = new String("abc");
        String s2 = new String("network");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        String s3= new String("helloNetwork");
        System.out.println(s3.hashCode());

        char[] ch = {'a','c','a','e','e','e'};
        int c = 61;
        System.out.println((char)c);
        methodHash(ch);

    }

    private static void methodHash(char[] chars) {
        int a = 0;
        for (int i = 0; i <chars.length ; i++) {
            a = 31 * a + chars[i];
        }

    }

    private static void ten2Six(int h2) {
        String s = Integer.toHexString(h2);
        System.out.println(s);
    }






}
