package day05_ExceptionAndThread.Thread;

/**
 * Created by yanyuchun on 2020/4/12
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("thread-->"+i);
        }
    }
}
