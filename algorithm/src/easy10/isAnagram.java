package easy10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yanyuchun on 2020/6/29
 * <p>
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 */
public class isAnagram {

    @Test
    public void test() {
        String s = "anagram";
        String t = "nagaram";
//        boolean solution = Solution(s, t);
        boolean solution2 = Solution2(s, t);
        System.out.println(solution2);

    }

    private boolean Solution2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for (int i = 0; i <s.length() ; i++) {
            if (sChar[i]!=tChar[i]){
                return false;
            }
        }
        return  true;
    }


    public boolean Solution(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            list.add(a.charAt(i));
        }

        for (int i = 0; i <b.length() ; i++) {
            int index=0;
            if ((index = list.indexOf(b.charAt(i)))!=-1){
                list.remove(index);
            }else {
                return false;
            }
        }
        if (list.size() ==0) {
            return true;
        }
        return false;
    }
}
