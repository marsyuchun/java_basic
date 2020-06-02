package day13_Stream.Demo02Stream;

import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/5/26
 */
public class Demo02Stream_Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");

        // 使用map方法，map中是Function<Integer,Integer>接口
        Stream<Integer> stream1 = stream.map(n -> Integer.parseInt(n));
        stream1.forEach(n-> System.out.println(n));


    }
}
