package day06_Thread.WaitAndNotify;

/**
 * Created by yanyuchun on 2020/4/13
 * 等待唤醒案例：线程之间的通信
 *
 *
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    {
                        synchronized (obj){
                            try {
                                System.out.println("消费者1告知需要的商品和数量");
                                obj.wait();
                                System.out.println("消费者1告知需要的商品和数量2");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            // 唤醒后执行的代码
                            System.out.println("消费者1买到商品回家去");
                            System.out.println("===============================");
                        }
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    {
                        synchronized (obj){
                            try {
                                System.out.println("消费者2告知需要的商品和数量");
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            // 唤醒后执行的代码
                            System.out.println("消费者2买到商品回家去");
                            System.out.println("===============================");
                        }
                    }
                }
            }
        }.start();

        // 创建一个生产者线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    {
                        try {
                            //provider 花5s时间来准备商品
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (obj){
                            System.out.println("provider 准备好商品后，告知顾客");
                            // 通知顾客
                            obj.notify();
                        }
                    }
                }
            }
        }.start();
    }

}
