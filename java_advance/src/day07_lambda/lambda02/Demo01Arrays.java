package day07_lambda.lambda02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yanyuchun on 2020/4/20
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("李白",35),
                new Person("孙悟空",700),
                new Person("哪吒",5),
                new Person("黄忠",70)
        };

        // 匿名内部类
//        Arrays.sort(arr,new Comparator<Person>(){
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.age-o2.age;
//            }
//        });
        // lambda 表达式
        Arrays.sort(arr, Comparator.comparingInt(o -> o.age));
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
