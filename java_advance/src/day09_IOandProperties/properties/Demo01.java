package day09_IOandProperties.properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by yanyuchun on 2020/4/28
 */
/*
java.util.Properties 继承于 Hashtable ，来表示一个持久的属性集
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    private static void show03() throws IOException {
        // 1、创建Properties集合对象
        Properties ps = new Properties();
        ps.setProperty("李白", "刺客");
        ps.setProperty("钟馗", "法师");
        ps.setProperty("王昭君", "法师");
        ps.setProperty("后羿", "射手");

        ps.store(new FileOutputStream("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/properties/prop2.txt"),"save data");
    }

    /*
        void	store(OutputStream out, String comments）   将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法加载到 Properties表中的格式输出流。
        void	store(Writer writer, String comments)   将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。
     */
    private static void show02() throws IOException {
        // 1、创建Properties集合对象
        Properties ps = new Properties();
        ps.setProperty("李白", "刺客");
        ps.setProperty("钟馗", "法师");
        ps.setProperty("王昭君", "法师");
        ps.setProperty("后羿", "射手");

        FileWriter fw = new FileWriter("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/properties/prop.txt");
        ps.store(fw,"save data");
        fw.close();

    }

    /*
    使用properties集合存储数据，遍历取出properties集合重的数据
    方法：
        Object	setProperty(String key, String value)  调用 Hashtable方法 put
        String	getProperty(String key) 使用此属性列表中指定的键搜索属性。
        Set<String>	stringPropertyNames() 返回此属性列表中的一组键，其中键及其对应的值为字符串，包括默认属性列表中的不同键，如果尚未从主属性列表中找到相同名称的键。
     */
    private static void show01() {
        // 1、创建Properties集合对象
        Properties ps = new Properties();
        ps.setProperty("李白", "刺客");
        ps.setProperty("钟馗", "法师");
        ps.setProperty("王昭君", "法师");
        ps.setProperty("后羿", "射手");

        Set<String> strings = ps.stringPropertyNames();
        for (String string : strings) {
            String value = ps.getProperty(string);
            System.out.println(string+"--"+value);
        }


    }

}
