package day04_Map.Map_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by yanyuchun on 2020/4/5
 * keySet使用
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("古力娜扎",168);
        map.put("杨幂",165);
        map.put("赵丽颖",160);
        map.put("林志玲",178);

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+"="+map.get(next));
        }

        System.out.println("----------------------");
        for (String s : map.keySet()) {
            System.out.println(s+"="+map.get(s));
        }
    }
}
