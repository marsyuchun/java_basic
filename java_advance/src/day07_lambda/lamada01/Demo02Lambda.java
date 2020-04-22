package day07_lambda.lamada01;

/**
 * Created by yanyuchun on 2020/4/20
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        // 使用匿名内部类实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建一个新线程！");
            }
        }).start();


        // 使用lambda方式创建多线程
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"创建一个新线程！")).start();

        
    }
}
