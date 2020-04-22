package day05_ExceptionAndThread.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/10
 */
public class Demo06Finally {

    public static void main(String[] args) {
        try {
            readFile("d.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 无论是否出现异常都会执行
            System.out.println("资源释放");
        }


    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件名后缀错误");
        }

        if (!fileName.equals("/User/yanyuchun/worksace/read.txt")){
            throw new FileNotFoundException("找不到该文件");
        }

    }
}
