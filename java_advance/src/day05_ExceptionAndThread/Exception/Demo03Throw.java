package day05_ExceptionAndThread.Exception;

/**
 * Created by yanyuchun on 2020/4/8
 */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] arr =new int[3];
        int element = getElement(arr, 1);
        System.out.println(element);

    }

    public static int getElement(int[] arr,int index){
        if (arr == null) {
            throw new NullPointerException("传入的参数为空");
        }
        if (index<0 || index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("数组索引越界！");
        }
        int ele = arr[index];
        return ele;
    }
}
