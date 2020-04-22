package day06_Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yanyuchun on 2020/4/13
 */
public class RunnableImpl implements Runnable{
    // 创建100张票
    private static int tickets = 10;

    Lock l = new ReentrantLock();

    @Override
    public void run() {

        while (true){
            l.lock();

            if (tickets>0){
                // 提高问题出现概率
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"正在售卖第"+tickets+"张票。");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }
            }
        }
    }
}
