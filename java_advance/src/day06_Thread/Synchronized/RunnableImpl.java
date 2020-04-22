package day06_Thread.Synchronized;

/**
 * Created by yanyuchun on 2020/4/13
 */
public class RunnableImpl implements Runnable{
    // 创建100张票
    private static int tickets = 10;
    Object obj = new Object();

    @Override
    public void run() {

        while (true){
            // 同步代码块
            payTicketStatic();
        }
    }

    public static /* synchronized */ void payTicketStatic(){
        synchronized (RunnableImpl.class){
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


    public synchronized void payTicket(){
        synchronized (this){
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
