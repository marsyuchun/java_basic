package day13_Stream.Demo02Stream;

import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/5/26
 */
public class Demo02Stream_Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张飞", "张无忌", "张朝阳","赵云");
        Stream<String> stream1 = stream.filter(n -> n.startsWith("张")).filter(n -> n.length() != 2);
        stream1.forEach(n-> System.out.println(n));
        /*
            Stream流属于管道流，只能被消费一次
            第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
            而这时第一个Stream流已经使用完毕，就会关闭了
            所以第一个Stream流就不能再调用方法了
         */
        stream.filter(n-> n.startsWith("张"));
    }
}
