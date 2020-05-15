package day09_IOandProperties.Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/28
 */
public class InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/eat.txt");

//        read1(file);
        read2(file);
    }

    /*
    批量读取
     */
    private static void read2(File file) throws IOException {
        FileReader fr = new FileReader(file);
        char[] cs = new char[1024];
        int len=0;
        while ((len = fr.read(cs)) != -1) {
            System.out.print(new String(cs,0,len));
        }
        fr.close();
    }


    /*
    单个读取
     */
    private static void read1(File file) throws IOException {
        FileReader fr = new FileReader(file);
        int read;
        while ((read = fr.read()) != -1) {
            System.out.print((char) read);
        }
        fr.close();
    }


}
