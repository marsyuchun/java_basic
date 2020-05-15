package day10_Stream.serialize;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by yanyuchun on 2020/5/4
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("java_advance/src/day10_Stream/serialize/wenben.txt");
        ps.append("d");


        System.setOut(ps);
        System.out.println("把需要的内容输出到文件中");
        ps.close();
    }
}
