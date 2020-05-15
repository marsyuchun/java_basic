package day10_Stream.StringBuffer;

import java.io.*;

/**
 * Created by yanyuchun on 2020/4/29
 */
public class Demo02BufferInputStream {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/IOStream/b.txt");
        readStream(f);
        readStream2(f);
    }

    private static void readStream2(File f) throws IOException {
        FileReader fis = new FileReader(f);
        BufferedReader br = new BufferedReader(fis);

        int read = 0;
        while ((read =br.read())!=-1){
            System.out.println((char) read);
        }
    }

    private static void readStream(File f) throws IOException {
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream br = new BufferedInputStream(fis);

        int read = 0;
        while ((read =br.read())!=-1){
            System.out.println((char) read);
        }
    }
}
