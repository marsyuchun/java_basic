package day05_ExceptionAndThread.Thread;

/**
 * Created by yanyuchun on 2020/4/12
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Person p1 = new Person("黄忠");
        p1.run();
        System.out.println(0/0);

        Person p2 = new Person("赵云");
        p2.run();
    }
}
