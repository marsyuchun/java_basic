package day09_IOandProperties.IOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/26
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("java_advance/src/day09_IOandProperties/eat.txt"));
        String s = "我天天晚上想吃烤羊腿";

        fos.write(s.getBytes());

        fos.close();

    }
}
