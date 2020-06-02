package day13_Stream.Demo02Stream;

import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/5/28
 */
public class Demo02Limit {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8};
        Stream<Integer> nums1 = Stream.of(nums);
        nums1.skip(4).forEach(n-> System.out.println(n));
//        nums1.limit(3).forEach(n-> System.out.println(n));
    }

}
