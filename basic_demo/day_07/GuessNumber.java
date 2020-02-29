package basic_demo.day_07;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void guessNumber(int n){
        int num = new Random().nextInt(n+1);
        System.out.print("请输入1-"+n+"之间的数：");
        int guess = new Scanner(System.in).nextInt();
        boolean result = true;
        while (result == true){
            if (guess < num) {
                System.out.print("输入的数字太小，请重新输入：");
                guess = new Scanner(System.in).nextInt();
            }else if (guess > num){
                System.out.print("输入的数字太大，请重新输入：");
                guess = new Scanner(System.in).nextInt();
            }else {
                System.out.println("输入正确，正确答案为："+num);
                result = false;
            }
        }
    }

    public static void main(String[] args) {
        guessNumber(100);
    }
}
