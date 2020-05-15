package day09_IOandProperties.IOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/26
 */
/*
 * `public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。
 * `public void flush() ` ：刷新此输出流并强制任何缓冲的输出字节被写出。
 * `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
 * `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 * `public abstract void write(int b)` ：将指定的字节输出流。
 */

public class Demo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/IOStream/b.txt");
        write01(file);
        write02();
    }

    private static void write02() throws IOException {
        FileOutputStream fos = new FileOutputStream("java_advance/src/day09_IOandProperties/a.txt");
        fos.write(96);
        fos.close();
    }

    private static void write01(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(98);
        fos.close();


    }
}
