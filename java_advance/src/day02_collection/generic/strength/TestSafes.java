package day02_collection.generic.strength;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanyuchun on 2020/7/10
 */
public class TestSafes {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<>();
        String first = Safes.first(list);
        System.out.println(first);

        List<Integer> nums= new ArrayList<>();
//        nums.add("a");
        Class<? extends List> clzz = nums.getClass();
        Method declaredMethod = clzz.getDeclaredMethod("3", String.class);
        declaredMethod.invoke(nums,"name");
        System.out.println();


    }

}
