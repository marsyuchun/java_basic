package day05_ExceptionAndThread.Exception;

import java.util.ArrayList;

/**
 * Created by yanyuchun on 2020/4/10
 */
public class Demo07Exception {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        // 多个异常多次处理
//        try {
//            System.out.println(arr[4]);
//        }catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//
//        try {
//            System.out.println(list.get(5));
//        }catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        System.out.println("后续代码");

        // 多个异常一次处理
        try {
            System.out.println(arr[4]);
            System.out.println(list.get(5));
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("后续代码");

    }

}
