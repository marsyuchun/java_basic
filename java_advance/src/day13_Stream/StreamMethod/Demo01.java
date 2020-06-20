package day13_Stream.StreamMethod;

import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/6/13
 */
public class Demo01 {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("a","b","c");
        Stream<String> b = Stream.of("d","e");
        Stream<String> c = Stream.concat(a,b);

        c.forEach(n-> System.out.println(n));
    }
}
