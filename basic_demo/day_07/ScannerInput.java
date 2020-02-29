package basic_demo.day_07;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.print("请输入第三个数字：");
        int c = sc.nextInt();

        int max = (a > b ? a : b);
        max = (max > c ? max : c);
        System.out.println("最大值为："+max);


    }

}
