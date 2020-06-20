package day13_Stream.Demo02Stream;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yanyuchun on 2020/6/4
 */
public class Demo03Stream_collect {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("name", "age", "email", "address", "country");

        // 第一种方式
//        ArrayList<String> collect = stream.collect(
//                () -> {
//                    ArrayList<String> arrayList = new ArrayList<>();
//                    System.out.println("arrayList"+arrayList);
//                    return arrayList;
//                },
//                (theList, item) -> {
//                    theList.add(item);
//                    System.out.println("theList:"+theList);
//                },
//                (list1, list2) -> {
//                    System.out.println("list1："+list1);
//                    System.out.println("list2："+list2);
//                    list1.addAll(list2);
//                }
//        );
//        System.out.println(collect);


        // 使用collect
//        LinkedList<String> list2 = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
//        System.out.println(list2);
        // 第三种方法
        ArrayList<String> list3 = stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list3);
        TreeSet<String> treeSet = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);
        String s = stream.collect(Collectors.joining());
        System.out.println(s);
//        HashMap<String, String> collect = stream.collect(HashMap::new, (x, y) -> x.put(y, y), HashMap::putAll);
//        System.out.println(collect);
    }
}
