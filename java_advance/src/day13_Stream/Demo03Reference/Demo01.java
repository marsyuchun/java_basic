package day13_Stream.Demo03Reference;

/**
 * Created by yanyuchun on 2020/5/30
 */
public class Demo01 {
    public static void main(String[] args) {
        printString(System.out::println);
    }

    public static void printString(Printable p){
        p.print(1024);
    }
}
