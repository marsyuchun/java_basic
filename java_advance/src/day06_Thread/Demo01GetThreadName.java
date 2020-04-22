package day06_Thread;

/**
 * Created by yanyuchun on 2020/4/12
 */
/*
    创建多线程方法1：继承Thread类
        1、创建一个Thread类的子类
        2、在子类中重写run方法，设置线程任务
        3、创建子类的实现类对象，调用父类的start方法开启多线程任务
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

    }
}
