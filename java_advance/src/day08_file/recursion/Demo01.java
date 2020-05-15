package day08_file.recursion;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Created by yanyuchun on 2020/4/25
 */
public class Demo01 {
    public static void main(String[] args) {
        File f1 = new File("/Users/yanyuchun/myproject/java_basic/java_advance/src");
//        getAllFile1(f1);
//        getAllFile2(f1);
        getAllFile3(f1);

    }

    /*
    使用过滤器FileFilter
     */
    private static void getAllFile3(File dir) {
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir,name);
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".md");
            }
        });
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile3(file);
            } else {
                System.out.println(file);

            }
        }

    }

    /*
    使用过滤器FileFilter
    public File[] listFiles(FileFilter filter)
     */
    private static void getAllFile2(File dir) {
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".md");
            }
        });

        File[] files1 = dir.listFiles();
        for (File file : files) {
//            System.out.println(file);
            if (file.isDirectory()) {
                getAllFile1(file);
            } else {
                System.out.println(file.getName());

            }
        }
    }


    public static void getAllFile1(File dir) {
//        System.out.println(dir);
        if (dir.exists()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    getAllFile1(file);
                } else {
                    if (file.getName().toLowerCase().endsWith(".md")) {
                        System.out.println(file);
                    }
                }
            }
        }
    }
}
