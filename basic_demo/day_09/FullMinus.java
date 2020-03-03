package basic_demo.day_09;

import org.junit.Test;


import java.util.Arrays;

public class FullMinus {
    private void function(int[] nums, int target) {
        int right = 0;
        Arrays.sort(nums);
        if (target - nums[0] > 0){


            }else {
            System.out.println("购买商品价格为："+nums[0]);
        }
    }

    @Test
    public void test() {
        int[] goods = {18, 19, 17, 6, 7};
        function(goods, 20);
    }
}
