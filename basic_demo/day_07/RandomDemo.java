package basic_demo.day_07;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = 0;
        for (int i=1;i<100000;i++){
            int d = rd.nextInt(10)+1;
            if (d==10){
                num = num+1;
            }
        }
        System.out.println(num);


    }
}
