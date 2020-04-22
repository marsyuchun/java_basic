package day02_collection.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by yanyuchun on 2020/3/30
 *
 * public boolean add(E e)： 把给定的对象添加到当前集合中 。
 * public void clear() :清空集合中所有的元素。
 * public boolean remove(E e): 把给定的对象在当前集合中删除。
 * public boolean contains(E e): 判断当前集合中是否包含给定的对象。
 * public boolean isEmpty(): 判断当前集合是否为空。
 * public int size(): 返回集合中元素的个数。
 * public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        // 创建一个集合
        Collection<String> cs = new ArrayList<>();
        System.out.println(cs.add("兰陵王"));
        cs.add("不知火舞");
        cs.add("狄仁杰");
        cs.add("荆轲");
        cs.add("虞姬");
        System.out.println(cs);

        cs.remove("虞姬");
        System.out.println(cs);
//
//        cs.clear();
//        System.out.println(cs);
        System.out.println(cs.size());

        System.out.println(cs.contains("狄仁杰"));
        System.out.println(cs.contains("娜可露露"));

        Object[] arr = cs.toArray();
        System.out.println(arr);
        for (int i = 0; i <arr.length ; i++) {
            if (i ==arr.length-1){
                System.out.println(arr[i]);
            }else {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println(cs.isEmpty());
        cs.clear();
        System.out.println(cs.isEmpty());




    }
}
