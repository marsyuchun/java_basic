package demo01;

/**
 * Created by yanyuchun on 2020/5/17
 */
public class LargestChar {
    public static void main(String[] args) {
        String input = "abcdefgaaabbbbcdereeeeeeeeeeasfjdfdsjshg";
        String input1 = "1234324458435897687";

        largeChar(input1);
    }

    private static void largeChar(String input) {
        int length,max;
        char result;
        char[] chars = input.toCharArray();
        char c = input.charAt(1);
        System.out.println(c);

    }
}
