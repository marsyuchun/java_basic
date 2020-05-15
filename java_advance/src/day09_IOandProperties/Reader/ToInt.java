package day09_IOandProperties.Reader;

/**
 * Created by yanyuchun on 2020/4/28
 */
public class ToInt {
    public static void main(String[] args) {
        String s = "123234345563546543";
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
