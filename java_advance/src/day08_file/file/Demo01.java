package day08_file.file;

import java.io.File;

/**
 * 成员变量
 * 1、 static String pathSeparator   与系统相关的路径分隔符字符，为方便起见，表示为字符串。
 * 2、 static char pathSeparatorChar    与系统相关的路径分隔符。
 * 3、 static String separator    与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
 * 4、static char separatorChar  与系统相关的默认名称分隔符。
 * Created by yanyuchun on 2020/4/25
 */

public class Demo01 {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
    字符型成员变量
     */
    private static void show02() {
        char separator = File.separatorChar;
        System.out.println(separator);
        char pathSeparator = File.pathSeparatorChar;
        System.out.println(pathSeparator);
    }


    /*
    字符串成员变量
     */
    private static void show01() {
        String separator = File.separator;
        System.out.println(separator);
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);


    }
}
