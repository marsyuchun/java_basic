package day06_Thread;

/**
 * Created by yanyuchun on 2020/4/12
 */
public class MyThread extends Thread{
    // 重写run方法
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);

    }
}
