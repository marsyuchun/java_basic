package dynamic_01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by yanyuchun on 2020/4/15
 */

/*
    题目：
        一张优惠券，满X返Y元，用户想购买X种商品，每种只买一个，假设每种商品价格不重复，现在要在用户
    想购买的商品种，推荐给用户能满足满X元的最小组合。
    例如：满20元返10元
    用户备选商品价格为[18,19,17,6,7]
    请告诉用户购买17+6=23 是最小的大于20元的组合
    private int bestChoice(int[] nums, int target){……}
 */
public class DynamicMinus {
    int sum = 0;
    int[] nums = {19, 17, 6, 7};
    int target = 30;
    int m = 0;
    int[][] best;
    ArrayList<Integer> list = new ArrayList<>();
    int[] item =new int[nums.length];

    public int[][] getBest() {
        return best;
    }

    public void setBest(int[][] best) {
        this.best = best;
    }

    @Test
    public void test() {
        bestChoice(nums, target);
//        System.out.println("最大值为："+best[nums.length][m]);
        choiceList(nums.length , m );
        System.out.println("最佳的选择为："+list);

    }

    private void choiceList(int i, int j) {
        if (i>=1){
            if (best[i - 1][j] == best[i][j]) {
                list.add(nums[i-1]);
                choiceList(i - 1, j);
            } else if (best[i][j] != best[i - 1][j] && (best[i - 1][j - nums[i - 1]] + nums[i - 1]) == best[i][j]) {

                choiceList(i - 1, j-nums[i-1]);
            }

        }


    }

    private void bestChoice(int[] nums, int target) {
        int count = 0;

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            array.add(nums[i]);
        }
        if (sum < target) {
//            System.out.println("输入的数据不满足要求！");
            Assert.assertFalse("输入不满足最小要求", sum < target);
        }

        m = sum - target;
//        System.out.println(m);
        best = new int[nums.length + 1][m + 1];
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= m; j++) {
                count++;
                if (nums[i - 1] > j) {
                    best[i][j] = best[i - 1][j];  // 关键，放不下就不放了
                } else {
                    best[i][j] = Math.max(best[i - 1][j - nums[i - 1]] + nums[i - 1], best[i - 1][j]);
                }
            }
        }
        System.out.println("最合适的价格为：" + (sum - best[nums.length][m]));
        System.out.println("执行了：" + count + " 次");
        setBest(best);
    }


}
