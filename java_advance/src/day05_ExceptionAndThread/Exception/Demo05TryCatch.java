package day05_ExceptionAndThread.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/10
 */
public class Demo05TryCatch {
    public static void main(String[] args) {
        String filePath = "/User/yanyuchun/workspace/read.txt";
        try {
            readFile(filePath);
            System.out.println("FilePath:"+filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("这个代码之后一定要执行");
        }
        System.out.println("后续代码");

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
