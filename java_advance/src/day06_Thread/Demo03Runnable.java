package day06_Thread;

/**
 * Created by yanyuchun on 2020/4/12
 */
/*
    创建多线程任务的第二种方法：实现Runnable接口
        1、创建一个Runnable接口的实现类
        2、在实现类中重写Runnable接口的run方法，设置线程任务
        3、创建一个Runnable接口的实现类对象
        4、创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        5、调用Thread类中的start方法，开启新线程执行run方法

 */
public class Demo03Runnable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t =new Thread(run);
        t.setName("second");
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
