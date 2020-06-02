package day13_Stream.Demo02Stream;

import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/5/26
 */
public class Demo02Stream_forEach {
    public static void method(){

    }


    public static void main(String[] args) {
        //获取一个Stream
        Stream<String> name = Stream.of("黄忠", "张飞", "关羽", "马超","赵云");
        // 使用Stream流中的数据进行遍历
        name.forEach(s -> System.out.println(s));
    }

}
