package day07_lambda.thread;

/**
 * Created by yanyuchun on 2020/4/20
 */
public class ChiHuo extends Thread{
    private BaoZi bz;

    public ChiHuo(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("开始吃"+bz.getSkip()+bz.getStuffing()+"的包子");
                try {
                    bz.wait(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("吃货吃完了包子");
                bz.setFlag(false);
                System.out.println("========================================");
                bz.notify();
            }
        }
    }
}
