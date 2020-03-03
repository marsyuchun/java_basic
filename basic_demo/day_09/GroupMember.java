package basic_demo.day_09;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User{
    public GroupMember() {
    }

    public GroupMember(String userName) {
        super(userName);
    }

    public GroupMember(String userName, double balance) {
        super(userName, balance);
    }


    public void openRedpackage(ArrayList<Double> arr,String name){
        if (arr.size() <= 0) {
            System.out.println(name+" 您来晚了，红包已经被抢完了！！！");
            return;
        }
        Random r = new Random();
        int index = r.nextInt(arr.size());
        double remove = arr.remove(index);
        setBalance(remove);
        System.out.println(name+" 恭喜你抢到了"+remove+"元红包。");
    }

}
