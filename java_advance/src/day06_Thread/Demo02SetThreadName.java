package day06_Thread;

/**
 * Created by yanyuchun on 2020/4/12
 */
public class Demo02SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("喝水的线程");
        System.out.println(mt.getName());
    }
}
