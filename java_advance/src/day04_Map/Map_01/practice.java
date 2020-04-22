package day04_Map.Map_01;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by yanyuchun on 2020/4/5
 */
public class practice {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> characterIntegerHashMap = count1(str);
        System.out.println(characterIntegerHashMap);

        sortByCharacter(characterIntegerHashMap);
    }

    // 根据字数来排序一下   这个应该怎么实现？？
    private static void sortByCharacter(HashMap<Character, Integer> characterIntegerHashMap) {

    }

    private static HashMap<Character, Integer> count1(String str) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (hashmap.containsKey(chars[i])) {
                 hashmap.put(chars[i], hashmap.get(chars[i]) + 1);
            } else {
                hashmap.put(chars[i], 1);
            }

        }

        for (int i = 0; i < str.length(); i++) {
            if (hashmap.containsKey(str.charAt(i))) {
                hashmap.put(chars[i], hashmap.get(chars[i]) + 1);
            } else {
                hashmap.put(chars[i], 1);
            }

        }

        return hashmap;
    }




}
