package day09_IOandProperties.Reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/28
 */
public class DemoWriter {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/Reader/a.txt");
        FileWriter fw = new FileWriter(f,true);
        fw.write("金承武");
        fw.write(30001);
        fw.append("李白");
        fw.flush();
        fw.write('\r');

        String s = "今晚不想吃盒饭了";
        fw.write(s.toCharArray(),0,s.length()-1);

        fw.close();
    }
}
