package day04_Map.Map_01;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by yanyuchun on 2020/4/5
 * Hashtable:底层也是一个Hash表，是一个线程安全的集合，是单线程集合，速度慢
 * HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快
 *
 * HashMap集合（之前学的所有集合）可以存储null值、null键
 * Hashtable不可以存储null值、null键
 * properties 集合是Hashtable的子类，是唯一一个和IO流相结合的集合
 */
public class Demo04Hashtable {
    public static void main(String[] args) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        hashmap.put(null,0);
        hashmap.put(null,100);
        hashmap.put("互联网",50);

        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("武则天",70);
        ht.put(null,70);    // NullPointerException
    }
}
