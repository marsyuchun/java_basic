package day09_IOandProperties.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/27
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/day09【字节流、字符流】.md");
        String targetPath = "/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/day09_copy";
        String targetName="cd.md";
        checkParams(targetPath);
        File file = new File(targetPath,targetName);
        FileOutputStream fos = new FileOutputStream(file);

        int len =0;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();


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

