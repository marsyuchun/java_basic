package day05_ExceptionAndThread.Exception;

/**
 * Created by yanyuchun on 2020/4/8
 */
public class Demo02Exception {
    public static void main (String[] args){
        int[] arr = {1,3,44,23,54,99,666,45};
        try {
            int element = getElement(arr, 12);
            System.out.println(element);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("End!");
    }

    public static int getElement(int[] arr,int index){
        int ele = arr[index];
        return ele;
    }

}

