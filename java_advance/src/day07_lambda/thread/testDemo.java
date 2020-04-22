package day07_lambda.thread;

/**
 * Created by yanyuchun on 2020/4/20
 */
public class testDemo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        ChiHuo ch = new ChiHuo("Mars",bz);
        BaoZiPu bzp = new BaoZiPu("庆丰",bz);

        ch.start();
        System.out.println(ch.getName());
        bzp.start();

    }
}
