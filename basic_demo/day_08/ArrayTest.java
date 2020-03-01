package basic_demo.day_08;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    /**
     * 任意输入一个字符串，然后转化成数组，排序后倒序输出
     * @param
     */
    public static void sortCharacter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        for (int i=chars.length-1;i>0;i--){
            System.out.println(chars[i]);
        }

    }

    public static void main(String[] args) {
        sortCharacter();
    }
}
