package day10_Stream.StringBuffer;

import java.io.*;

/**
 * Created by yanyuchun on 2020/4/29
 */
public class Demo01BufferOutputStream {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day10_Stream/StringBuffer/01.txt");
        bufferInputStream01(f);
        bufferOutputStream02(f);
    }

    /*
    字节缓冲输出流
     */
    private static void bufferOutputStream02(File f) throws IOException {
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
//        InputStreamReader isr = new InputStreamReader(, )

        int read = bis.read();
        System.out.println(read);
        bis.close();
    }

    /*
    字节缓冲输入流
     */
    private static void bufferInputStream01(File f) throws IOException {
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("明细一下异常信息区分开".getBytes());
        bos.close();
    }
}
