package day05_ExceptionAndThread.Thread;

/**
 * Created by yanyuchun on 2020/4/12
 *
 * 创建多线程程序的第一种方法：创建thread的子类
 *
 */
public class Demo02Thread {
    public static void main(String[] args) {
        MyThread mt  = new MyThread();
        mt.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println("main-->"+i);
        }
    }

}
