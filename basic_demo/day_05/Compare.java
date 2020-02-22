package basic_demo.day_05;

public class Compare {
    public static void compareMax(int[] a){
        int max = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]>= max){
                max = a[i];
            }
        }
        System.out.println("数组中最大的数为："+max);
    }

    public static void main(String[] args) {
        int[] arr = {1,23,33,2,56,99,98,25,99};
        compareMax(arr);
    }
}
