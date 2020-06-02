package day13_Stream.Demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/5/28
 */
public class Demo0Stream_2Count {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("张三丰", "张飞", "张无忌", "张朝阳", "赵云");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i * (i + 1));
        }
        Stream<Integer> stream = list.stream();
        long count = stream.filter(name -> name % 3 == 0).count();
        System.out.println(count);
    }
}
