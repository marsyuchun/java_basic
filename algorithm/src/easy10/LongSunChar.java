package easy10;

import org.junit.Test;

import java.util.*;

/**
 * Created by yanyuchun on 2020/5/28
 * 查看一个字符串中的最长不重复子串
 */
public class LongSunChar {
    @Test
    public void test() {
//        String s = genericString(200);
//        System.out.println(s);

        int num = lengthOfLongestSubstring("qjzmovqmehspkgjxapdkjhwxroxulcxyrleliiguzzlgvurxhiblsurlvbyugngahjervxxfybozotmnyivktlxnlsfbxrwtfuwjwdkmgjxxoeroctkhktzyjoskcntfjakcuqerpuayakypsaqzttsoauaqbzhjocbjkgtpvsegkdnqkrpqyhokrlktnhdygwsvcylw");

        System.out.println("pqyhokrlktnhd".length());
        System.out.println(num);
    }

    private String genericString(int a) {
        char[] chars = new char[a];
        for (int j = 0; j < a; j++) {
            int i = new Random().nextInt(26) + 97;
            chars[j] = (char) i;
        }
        return new String(chars);

    }


    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0,i = 0;
        Set<String > set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i );
            map.put(s.charAt(j), j);
            if (ans ==13 && (ans+j)<n){
                if (unique(s.substring(j,ans+j))){
                    set.add(s.substring(j,ans+j));
                }
            }

        }
        System.out.println(set);
        return ans;
    }

    public static boolean unique(String s){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        if (set.size()!=s.length()){
            return false;
        }
        return  true;
    }
}
