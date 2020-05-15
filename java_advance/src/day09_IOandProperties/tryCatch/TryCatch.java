package day09_IOandProperties.tryCatch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/28
 */

/*
    try{
        可能会产生异常的代码块
    }catch(){
        异常的处理逻辑
    }finally{
        一定会执行的代码
        资源释放
    }
 */
public class TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File f = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src/day09_IOandProperties/Reader/a.txt");
            fw = new FileWriter(f,true);
            fw.write("金承武"+"\n");
        }catch (IOException io){
            System.out.println(io);
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
