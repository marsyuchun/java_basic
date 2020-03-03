package basic_demo.day_09;

import java.util.ArrayList;

public class GroupOwner extends User {

    public GroupOwner() {
    }

    public GroupOwner(String userName, double balance) {
        super(userName, balance);
    }

    /**
     * 群主发红包，就是把一个整数的金额，分层若干等份。
     * 1.获取群主余额,是否够发红包.不能则返回null,并提示.能则继续.
     * 2.修改群主余额.
     * 3.拆分红包.
     * 3.1.如果能整除，那么就平均分。 3.2.如果不能整除，那么就把余数分给最后一份
     */
    public ArrayList<Double> send(int money, int count) {
        ArrayList<Double> receive = new ArrayList<>();
        double balance = this.getBalance();
        if (balance < money) {
            System.out.println("你只有"+balance+"元钱了！！！");
            return null;
        } else {
            setBalance(balance - money);
            money = money * 100;
            //每份的份额
            int m = money / count;
            int l = money % count;
            for (int i = 0; i <count-1 ; i++) {
                receive.add(m/100.0);

            }
            if (l == 0){
                receive.add(m/100.0);
            }else{
                receive.add(((m+l)/100.0));
            }
            return  receive;
        }

    }
}
