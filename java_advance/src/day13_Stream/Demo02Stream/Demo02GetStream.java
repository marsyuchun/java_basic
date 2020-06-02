package day13_Stream.Demo02Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/5/26
 */
public class Demo02GetStream {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        Map<String,String> map = new HashMap<>();
        map.put("姓名","荆轲");
        Stream<String> stream2 = map.keySet().stream();
        Stream<String> stream3 = map.values().stream();
        Stream<Map.Entry<String, String>> stream4 = map.entrySet().stream();
        stream4.forEach(name -> System.out.println(name.getKey()+":"+name.getValue()));


//        Stream<String> stream2 = map.keySet().stream();
//        // 获取值，存储到一个collection集合中
//        Collection<String> values = map.values();
//        Stream<String> stream3 = values.stream();
//
//        // 获取键值对
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        Stream<Map.Entry<String, String>> stream4 = entries.stream();
//        stream4.forEach(name-> System.out.println(name.getKey()+name.getValue()));

        // 把数组转换为Stream流
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,6);
        Integer[] arr = {1,2,3,4};
        Stream<Integer> arr1 = Stream.of(arr);
        System.out.println(arr1);
        String [] arr2 = {"aa","bb","name"};
        Stream<String> arr4 = Stream.of(arr2);



    }
}
