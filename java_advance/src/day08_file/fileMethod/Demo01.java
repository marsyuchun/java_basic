package day08_file.fileMethod;

import java.io.File;

/**
 * Created by yanyuchun on 2020/4/24
 */
public class Demo01 {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    /*
        public long length()
        返回由此抽象路径名表示的文件的长度。 如果此路径名表示目录，则返回值未指定。
        其中要求区分该情况下的I / O异常0L其中相同文件的多个属性是必需的，同时被返回，或者，那么Files.readAttributes可以使用方法。

        结果
        由此抽象路径名表示的文件的长度（以字节为单位），如果文件不存在， 0L 。 某些操作系统可能会返回0L用于表示系统依赖实体（如设备或管道）的路径名。
             */
    private static void show04() {
        File f1 = new File("/Users/yanyuchun/myproject/java_basic/");
        long absolutePath1 = f1.length();
        File f2 = new File("java_advance/src/day08_file/03");
        long absolutePath2 = f2.length();
        System.out.println(f2.getAbsolutePath());
        System.out.println(absolutePath1);
        System.out.println(absolutePath2);
    }

    /*
        public String getName()
        返回由此抽象路径名表示的文件或目录的名称。 这只是路径名称序列中的最后一个名字。 如果路径名的名称序列为空，则返回空字符串。
        结果
        由此抽象路径名表示的文件或目录的名称，如果此路径名的名称序列为空，则为空字符串
     */
    private static void show03() {
        File f1 = new File("/Users/yanyuchun/myproject/java_basic/");
        String absolutePath1 = f1.getName();
        File f2 = new File("02.txt");
        String absolutePath2 = f2.getName();
        System.out.println(absolutePath1);
        System.out.println(absolutePath2);
    }

    /*
    public String getPath()
    将此抽象路径名转换为路径名字符串。 结果字符串使用default name-separator character以名称顺序分隔名称。
    结果
    这个抽象路径名的字符串形式

     */
    private static void show02() {
        File f1 = new File("/Users/yanyuchun/myproject/java_basic/01.txt");
        String absolutePath1 = f1.getPath();
        File f2 = new File("02.txt");
        String absolutePath2 = f2.getPath();
        System.out.println(absolutePath1);
        System.out.println(absolutePath2);
    }


    /*
        public String getAbsolutePath()
        返回此抽象路径名的绝对路径名字符串。
        结果
        绝对路径名字符串表示与此抽象路径名相同的文件或目录
     */
    private static void show01() {
        File f1 = new File("/Users/yanyuchun/myproject/java_basic/01.txt");
        String absolutePath1 = f1.getAbsolutePath();
        File f2 = new File("02.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath1);
        System.out.println(absolutePath2);
    }
}
