package day08_file.file;

import java.io.File;

/**
 * Created by yanyuchun on 2020/4/24
 */

/*
    构造方法：
    1、 File(File parent, String child)
     从父抽象路径名和子路径名字符串创建新的 File实例。
    2、 File(String pathname)
    通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
    3、 File(String parent, String child)
    从父路径名字符串和子路径名字符串创建新的 File实例。
 */
public class Demo02File {
    public static void main(String[] args) {
        // show01();
//        show02();

//        show03();
        testFile();
    }

    private static void testFile() {
        File file = new File("/Users/yanyuchun/myproject/java_basic///////");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());

    }

    private static void show03() {
        File parent = new File("/Users/yanyuchun/myproject/java_basic///////");
        File f4  = new File(parent,"java_advance/day08/02.txt");
        System.out.println(f4);
    }

    private static void show02() {
        File f3 = new File("/Users/yanyuchun/myproject/java_basic","java_advance/day08/01.txt");
        System.out.println(f3);


    }

    private static void show01() {
        File f1 = new File("/Users/yanyuchun/myproject/java_basic/java_advance/a.txt");
        System.out.println(f1);

        File f2 = new File("/Users/yanyuchun/myproject/java_basic/java_advance/day99/day02");
        System.out.println(f2);

    }
}
