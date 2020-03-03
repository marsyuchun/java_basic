package basic_demo.day_09;


import java.util.ArrayList;
import java.util.Scanner;

public class RedPackage {

    public static void main(String[] args) {

        GroupOwner go =new GroupOwner("马云",2000);
        // 从键盘创建一个输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入发出红包的金额：");
        int money = sc.nextInt();
        System.out.println("请输入红包个数：");
        int count = sc.nextInt();

        // 发送红包
        ArrayList<Double> sendList = go.send(money,count);

        if (sendList == null) {
            System.out.println("余额不足");
            return;
        }

        GroupMember gm1 = new GroupMember("天猫");
        GroupMember gm2 = new GroupMember("淘宝");
        GroupMember gm3 = new GroupMember("蚂蚁金服");
        GroupMember gm4 = new GroupMember("聚划算");

        gm1.openRedpackage(sendList,gm1.getUserName());
        gm2.openRedpackage(sendList,gm2.getUserName());
        gm3.openRedpackage(sendList,gm3.getUserName());
        gm4.openRedpackage(sendList,gm4.getUserName());

        go.show();
        gm1.show();
        gm2.show();
        gm3.show();
        gm4.show();

    }
}
