package basic_demo.day_07;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList46 {
    public static void main(String[] args) {
        ArrayList<Integer> arr =  generateArray(100,33);
        printArray(arr);
    }

    // 方法创建一个长度为n,1-m之间的ArrayList
    public static ArrayList<Integer> generateArray(int n,int m){
        ArrayList<Integer> arr = new ArrayList<>();
        Random num = new Random();
        for (int i=0;i<n;i++){
            int s = num.nextInt(m)+1;
            arr.add(s);
        }
        return arr;
    }

    // 遍历ArrayList
    public static void printArray(ArrayList<Integer> array){
        System.out.println(array);
        System.out.println("---------------------");
        for (int i=0;i< array.size();i++){
            System.out.println(array.get(i));
        }
    }
}
