package day06_Thread;

/**
 *
 * 匿名内部类实现多线程
 * Created by yanyuchun on 2020/4/12
 */
public class InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println("程序员-->"+ i);
                }
            }
        }.start();

        Runnable r =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("产品经理-->"+i);
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println("项目经理-->"+i);
                }
            }
        }).start();

    }
}
