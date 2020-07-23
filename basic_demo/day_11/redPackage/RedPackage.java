package basic_demo.day_11.redPackage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yanyuchun on 2020/7/2
 * 领红包功能
 * 入参：金额、人数
 * 输出：输出所有金额
 * 逻辑：
 * 1.所有人抢到金额之和等于红包金额，不能超过，也不能少于。
 * 2.每个人至少抢到一分钱。
 * 3.要保证所有人抢到金额的几率相等。
 */
public class RedPackage {
    public static void main(String[] args) {
        redPackage(1, 200);

    }

    private static void redPackage(int money, int num) {
        int realMoney = money * 100;
        int somePackage = 0;
        ArrayList<Double> list = new ArrayList<>();
        if (realMoney >= num) {
            realMoney = realMoney - num;
            for (int i = 0; i < num; i++) {
                if (i!=num-1){
                    somePackage = new Random().nextInt(realMoney+1);
                    realMoney = realMoney - somePackage;
                    list.add((double) (somePackage+1)/100);
                }else {
                    somePackage = realMoney;
                    list.add((double)(somePackage+1)/100);
                }

            }
            System.out.println(list);
        } else {
            System.out.println("你也太抠了吧，每人一分都不够～～");
        }
    }


}
