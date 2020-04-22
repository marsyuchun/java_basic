package day07_lambda.lamada01;

import day07_lambda.threadPool.RunnableImpl;

/**
 * Created by yanyuchun on 2020/4/20
 * 用实现runnable接口实现类的方法，设置线程任务
 */
public class Demo01 {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();

        Thread t = new Thread(run);
        t.start();


        //匿名内部类

        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()+"创建新线程"));

            t1.start();
    }
}
