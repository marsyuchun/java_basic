package day09_IOandProperties.tryCatch;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/28
 */
/*
使用JDK7优化后的 try-with-resource 语句，该语句确保了每个资源在语句结束时关闭。所谓的资源
(resource)是指在程序完成后，必须关闭的对象。
    格式：
        try(){}
 */
public class Demo2JDK7 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/Reader/a.txt", true);){
            fw.write("金承武" + "\n");
            fw.write("金承武" + "\n");
            fw.write("金承武" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
