package day06_Thread;

/**
 * Created by yanyuchun on 2020/4/13
 */
public class Demo07Clock {
    public static void main(String[] args)  {
        for (Integer i = 0; i < 60; i++) {
//            if (i>=10){
//                System.out.println("当前时间为00:"+ i);
//            }else {
//                System.out.println("当前时间为00:0"+ i);
//
//            }
            String s =i.toString().length()<2 ? "0"+i : i.toString();
            System.out.println("当前时间为00:"+ s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
