package day02_collection.generic;

import java.util.ArrayList;

/**
 * Created by yanyuchun on 2020/3/31
 *
 * 使用含有泛型接口的第一种方法
 * 定义类时确定泛型类型
 */
public class GenericInterfaceImp1 implements GenericInterface<String>{
    ArrayList<String> arr = new ArrayList<>();
    @Override
    public void add(String s) {
        arr.add(s);
    }

    @Override
    public String getE() {
        if (arr.iterator().hasNext()){
            return arr.iterator().next();
        }
        return null;
    }
}
