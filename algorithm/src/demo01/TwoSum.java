package demo01;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanyuchun on 2020/4/19
 */
public class TwoSum {
    /*
        两数之和
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("No two sum solution");
    }

    public void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }

    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
//        int[] result = twoSum(nums, target);
//        print(result);
        int[] result1 = twoSum1(nums, target);
        print(result1);
    }
}
