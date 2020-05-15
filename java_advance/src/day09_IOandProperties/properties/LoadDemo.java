package day09_IOandProperties.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by yanyuchun on 2020/4/28
 */
public class LoadDemo {
    /*
    void	load(InputStream inStream)  从输入字节流读取属性列表（键和元素对）。
    void	load(Reader reader)   以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
     */
    public static void main(String[] args) throws IOException {
        load01();
        load02();

    }

    private static void load02() throws IOException {
        Properties p1 = new Properties();
//        p1.load(new FileReader("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/properties/prop.txt"));
        p1.load(new FileInputStream("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/properties/prop.txt"));
        Set<String> strings = p1.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"="+p1.getProperty(string));
        }
    }

    private static void load01() {
    }
}
