package day10_Stream.StringBuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/5/1
 */
public class Demo02BufferWriter {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
//        write01();
        write02();
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
    }

    private static void write02() throws IOException {
        FileWriter fw = new FileWriter("java_advance/src/day10_Stream/StringBuffer/01.txt");
        for (int i = 0; i <100000 ; i++) {
            fw.write("今晚上想吃烤羊腿");
            fw.write("/r");
        }
        fw.close();

    }

    /*
    使用bufferWriter方式写入
     */
    private static void write01() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("java_advance/src/day10_Stream/StringBuffer/01.txt"));
        for (int i = 0; i <100000 ; i++) {
            bw.write("今晚上想吃烤羊腿");
            bw.newLine();
        }
        bw.close();
    }
}
