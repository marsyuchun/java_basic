package day07_lambda.thread;

/**
 * Created by yanyuchun on 2020/4/20
 */
public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count =0;
        while (true){
            synchronized (bz){
                if (bz.flag){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("没有包子，包子铺开始生产包子");
                try {
                    Thread.sleep(2000);
                    if (count%2==0){
                        bz.setSkip("薄皮");
                        bz.setStuffing("猪肉大葱");
                    }else {
                        bz.setSkip("冰皮");
                        bz.setStuffing("三鲜虾仁");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.setFlag(true);
                System.out.println(bz.getSkip()+bz.getStuffing()+"的包子做好了，通知吃货吃包子");
                bz.notify();
            }
        }
    }
}
