package day04_Map.Map_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by yanyuchun on 2020/4/5
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("古力娜扎",168);
        map.put("杨幂",165);
        map.put("赵丽颖",160);
        map.put("林志玲",178);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries.size());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getValue());

        }

    }
}
