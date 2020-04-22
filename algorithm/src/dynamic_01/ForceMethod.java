package dynamic_01;

import org.junit.Test;

/**
 * Created by yanyuchun on 2020/4/16
 */
public class ForceMethod {
    int[] nums = {19, 17, 6, 7};
    int minus = 20;

    /*
    分析问题：
    1、算出所有可能的价值组合，即从N件商品中取得所有商品的组合
    共有 2的N方 -1 种组合，现在列出来这写组合数
    2、
     */


    @Test
    public void test() {

    }
    private void count(int[] nums,int length){
        int new_arraY_l = 1;
        for (int i = 0; i <length ; i++) {
            new_arraY_l*=2;
        }
        new_arraY_l=new_arraY_l-1;
        int[] result = new int[new_arraY_l];
        int count=0;
        if (length>1){
            count(nums, length-1);
        }else {

        }
    }

    private void function(int[] value, int minus) {
        int item ;
        int target = 0;
        for (item = value.length; item >0 ; item--) {

        }
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            
            for (int j = 0; j < value.length; j++) {
                sum = value[j];

                if (sum < target) break;
            }
        }


    }
}
