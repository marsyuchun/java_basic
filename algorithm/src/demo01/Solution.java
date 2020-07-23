package demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanyuchun on 2020/5/22
 */
public class Solution {
    public static void main(String[] args) {
        int num = lengthOfLongestSubstring("aabbccbcdfredf");
        int num1 = method("aabbccbcdfredf");
        System.out.println(num1);


    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        System.out.println(map);
        return ans;
    }

    public static int method(String s) {
        int n = s.length(), result = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0, j = 0; i < n; i++) {
            if (map1.containsKey(s.charAt(i))){
                j=Math.max(j,map1.get(s.charAt(i)));
            }
            result = Math.max(result,i-j+1);
            map1.put(s.charAt(i),i+1);
        }
        return result;
    }

}