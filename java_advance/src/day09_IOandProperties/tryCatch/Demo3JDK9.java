package day09_IOandProperties.tryCatch;

import java.io.*;

/**
 * Created by yanyuchun on 2020/4/28
 */
/*
    JDK9新特性：
    try前面定义流对象
    在try后边的（）中可以直接引入流对象的名称（变量名）
    在try代码执行完毕之后，流对象也可以释放掉，不用写finally
    格式：
        A a = new A();
        B b = new B();
        try(a； b){
        }catch(){
        }
 */
// 妈的，我这个版本是jdk8 ，不支持，改成jdk7的了
public class Demo3JDK9 {
    public static void main(String[] args) {
        String targetPath = "/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/day09_copy";
        String targetName="cd.md";
        checkParams(targetPath);
        File file = new File(targetPath,targetName);
        try(FileInputStream fis = new FileInputStream("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/day09【字节流、字符流】.md");
            FileOutputStream fos = new FileOutputStream(file);) {
            int len =0;
            byte[] bytes = new byte[1024];
            while ((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            System.out.println(e);
        }


    }

    private static void checkParams(String targetPath) {
        File file = new File(targetPath);
        if (!file.exists()){
            String absolutePath = file.getAbsolutePath();
            System.out.println(absolutePath);
            String  path = new String(absolutePath.getBytes(),0,absolutePath.length());
            File file1 = new File(path);
            file1.mkdirs();
        }
    }
}
