package easy10;

import org.junit.Test;

/**
 * Created by yanyuchun on 2020/6/23
 */

public class FirstRepeat {
    /*
    求一个字符串中首次出现连续重复子字符串的位置
     */
    private int first(String s){
        for (int i = 0 ; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test() {
//        String s = genericString(200);
//        System.out.println(s);

        int index = first("abcddgsaabcede");
        System.out.println(index);
    }

}
