package day10_Stream.test;

import java.io.*;

/**
 * Created by yanyuchun on 2020/5/1
 * 测试复制一个文件的效率
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day10_Stream/1.dmg");
        File targetFile = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day10_Stream/test/1.dmg");
        long start = System.currentTimeMillis();
        copy1(file, targetFile);
        long end = System.currentTimeMillis();
        System.out.println("执行用时:" + (end - start) + "毫秒");
    }

    /*
    使用字节流逐个复制
     */
    private static void copy1(File file, File target) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(target);
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
    }

    /*
    使用字节流复制多个数组
    */
    private static void copy2(File file, File target) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(target);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }

    /*
    使用缓冲字节输入流
    */
    private static void copy3(File file, File target) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(target);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bos.close();
        bis.close();
    }

    /*
    使用增强缓冲字节输入流
    */
    private static void copy4(File file, File target) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(target);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[2048];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
