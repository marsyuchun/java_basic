package day12_FunctionalInterface.LambdaTest;

/**
 * Created by yanyuchun on 2020/5/9
 */
public class Demo01Runnable {
    public static void startThread(Runnable run){
        // 开启线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"---> 线程启动了");
            }
        });

        startThread(() -> System.out.println(Thread.currentThread().getName()+"---> 线程启动了"));
    }
}
