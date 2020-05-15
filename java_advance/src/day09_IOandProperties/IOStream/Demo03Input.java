package day09_IOandProperties.IOStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/26
 */
public class Demo03Input {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("java_advance/src/day09_IOandProperties/IOStream/b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            System.out.print(new String(bytes,0,len));
        }
    }
}
