package day06_Thread.Synchronized;


/**
 * Created by yanyuchun on 2020/4/13
 */
public class Demo01Tickets {
    public static void main(String[] args) {
        //创建三个线程同时售票
        RunnableImpl run = new RunnableImpl();
        Thread t1 = new Thread(run);
        t1.setName("1号窗口售票员");
        Thread t2 = new Thread(run);
        t2.setName("1号窗口售票员");
        Thread t3 = new Thread(run);
        t3.setName("3号窗口售票员");

        // 开始售票
        t1.start();
        t2.start();
        t3.start();





    }

}
