package demo01;

import java.util.HashMap;

/**
 * Created by yanyuchun on 2020/5/22
 */
public class Demo0 {
    public static void main(String[] args) {
        String[] s = {"aa", "ab"};
//        method1(s);

        String s2 = method2(s);
        System.out.println(s2);
        String s3 = method3(s);
        System.out.println(s3);

    }

    private static String method3(String[] s) {
        if (s.length == 0)
            return "";
        String ans = s[0];
        for (int i = 1; i < s.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < s[i].length(); j++) {
                if (ans.charAt(j) != s[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if (ans.equals(""))
                return ans;
        }
        return ans;
    }


    //尝试用map解决
    private static String method2(String[] s) {
        if (s.length <= 0) {
            return "";
        }
        int length = s[0].length();
        int n = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() <= length) {
                length = s[i].length();
                n = i;
            }
        }

        String result = "";
        for (int i = 0; i <= length - 1; i++) {
            int num = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(s[n].toLowerCase().charAt(i), 0);
            for (String s1 : s) {
                if (map.containsKey(s1.toLowerCase().charAt(i))) {
                    num = num + 1;
                    map.put(s1.charAt(i), num);
                }
            }
            if (num != s.length) {
                break;
            } else {
                result += s[n].toLowerCase().charAt(i);
            }
        }
        return result;
    }

    private static void method1(String[] s) {
        int length = s[0].length();
        int n = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() <= length) {
                length = s[i].length();
                n = i;
            }
        }

        String result = "";
        for (int i = 0; i < length - 1; i++) {
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[i].toLowerCase().charAt(j) != s[n - 1].toLowerCase().charAt(j)) {
                    break;
                } else {
                    count++;
                    if (count == s.length) {
                        result += s[n].toLowerCase().charAt(i);
                    }
                }
            }
        }
        System.out.println(result);
    }


}
