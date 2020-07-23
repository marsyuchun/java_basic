package day02_collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yanyuchun on 2020/3/31
 * <p>
 * 使用含有泛型接口的第一种方法
 * 定义类时确定泛型类型
 */
public class GenericInterfaceImp1<String> implements GenericInterface<String> {
    ArrayList<String> arr = new ArrayList<>();

    @Override
    public void add(String s) {
        arr.add(s);
    }

    @Override
    public String getE() {
        if (arr.iterator().hasNext()) {
            String next;
            Iterator<String> it = arr.iterator();
            next = it.next();
            return next;
        }
        return null;
    }

}
