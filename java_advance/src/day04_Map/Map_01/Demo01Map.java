package day04_Map.Map_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by yanyuchun on 2020/4/5
 */
public class Demo01Map {
    public static void main(String[] args) {
        show1();
    }

    private static void show1() {
        Map<String,String> map = new HashMap<>();
        map.put("不知火舞","中单法师");
        map.put("娜可露露","刺客打野");
        map.put("廉颇","辅助坦克");
        String put = map.put("不知火舞", "上单法师");
        String s1 = map.remove("廉颇");
        System.out.println(s1);

        System.out.println(put);
        System.out.println(map);

        System.out.println("----------------------");
        Set<String> entries = map.keySet();
        for (String entry : entries) {
            System.out.println(entry);
        }


    }
}
