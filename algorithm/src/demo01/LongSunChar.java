package demo01;

import org.junit.Test;

import java.util.*;

/**
 * Created by yanyuchun on 2020/5/28
 */
public class LongSunChar {
    @Test
    public void test() {
        String s = genericString(200);
        System.out.println(s);

        int num = lengthOfLongestSubstring(s);
        System.out.println(num);
    }

    private String genericString(int a) {
        char[] chars = new char[a];
        for (int j = 0; j <a ; j++) {
            int i = new Random().nextInt(26)+97;
            chars[j]=(char) i;
        }
        return new String(chars);

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
        System.out.println(Arrays.toString(map.keySet().toArray()));
        return ans;
    }
}
