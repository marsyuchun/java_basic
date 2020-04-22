package day06_Thread.ThreadSafe;

/**
 * Created by yanyuchun on 2020/4/13
 */
public class RunnableImpl implements Runnable{
    // 创建100张票
    private int tickets = 10;

    @Override
    public void run() {

        while (true){
            if (tickets>0){
                // 提高问题出现概率
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售卖第"+tickets+"张票。");
                tickets--;
            }

        }
    }
}
