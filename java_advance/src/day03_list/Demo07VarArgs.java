package day03_list;

/**
 * Created by yanyuchun on 2020/4/3
 */
public class Demo07VarArgs {
    public static void main(String[] args) {

        int sum = addNumber(10, 12, 113, 44, 56);
        System.out.println(sum);
    }

    private static int addNumber(int... intNum) {
        int[] arr   = intNum;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }

    // 定义一个方法，计算n个int类型整数的和


}
