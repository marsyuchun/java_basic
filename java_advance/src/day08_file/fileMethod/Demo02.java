package day08_file.fileMethod;

import java.io.File;
import java.io.IOException;

/**
 * Created by yanyuchun on 2020/4/25
 */
public class Demo02 {
    public static void main(String[] args) throws IOException, InterruptedException, NoPathDeleteException {
//        show02();
        show03();
    }

    private static void show03() throws NoPathDeleteException {
        File f2 = new File("/Users/yanyuchun/myproject/java_basic/test/test2");
        File f3 = new File("/Users/yanyuchun/myproject/java_basic/test/test3");
        f2.mkdirs();
        f3.mkdirs();
//        f3.delete();
//        f2.delete();
        File f4 = new File("/Users/yanyuchun/myproject/java_basic/test");
        if (!f4.delete()){
            throw  new NoPathDeleteException("当前文件夹不可被删除");
        }
//        System.out.println(delete);




    }

    private static void show02() throws IOException, InterruptedException {
        File f1 = new File("/Users/yanyuchun/myproject/java_basic///////name.txt");
        System.out.println(f1.getAbsolutePath());
        f1.createNewFile();
        Thread.sleep(2000);
//        f1.delete();
    }
}
