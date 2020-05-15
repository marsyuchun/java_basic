package day10_Stream.convert;

import java.io.*;

/**
 * Created by yanyuchun on 2020/5/2
 */
public class Demo01Stream {
    public static void main(String[] args) throws IOException {
       read();
//        writer();
    }

    /*
    使用转换流写入
     */
    private static void writer() throws IOException {
        OutputStreamWriter isr1 = new OutputStreamWriter(new FileOutputStream("java_advance/src/day10_Stream/convert/write_utf-8.txt"),"UTF-8");
        OutputStreamWriter isr2 = new OutputStreamWriter(new FileOutputStream("java_advance/src/day10_Stream/convert/write_gbk.txt"),"GBK");
        isr1.write("吃饭\n");

        isr1.close();

        isr2.write("烧烤\r");

        isr2.close();
    }

    /*
    使用转换流读取
     */
    private static void read() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("java_advance/src/day10_Stream/convert/111.csv"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("java_advance/src/day10_Stream/convert/222.csv"),"UTF-8");
        int read;
        char[] bytes = new char[1024];
        while ((read = isr.read(bytes))!=-1){
            osw.write(bytes, 0, read);
        }
        osw.close();
        isr.close();
    }
}
