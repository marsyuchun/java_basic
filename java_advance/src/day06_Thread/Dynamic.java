package day06_Thread;

import org.junit.Test;

/**
 * Created by yanyuchun on 2020/4/13
 */
public class Dynamic {
    @Test
    public void test(){
        int[] arr = {19,17,6,7};
        int target = 20;
        findBest(arr,target);
    }



    private void findBest(int[] arr, int target) {
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum = arr[i] + sum;
        }
        if (sum<target){
            System.out.println("输入数据不满足满减要求！！");
        }
        int m = sum - target;
        int[] best = new int[m+1];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = m; j >= 0 ; j--) {
                if (arr[i]>j) {
                    break;
                }
                best[j] = Math.max(best[j-arr[i]]+ arr[i], best[j]);

            }

        }
        System.out.println(sum - best[m]);

    }

    private static String printarr(int[] args) {
        String s = "[";
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                s = s.concat(args[i] + "]");
            } else {
                s = s.concat(args[i] + ", ");
            }
        }
        return s;
    }


}
