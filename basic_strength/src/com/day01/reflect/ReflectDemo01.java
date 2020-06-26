package com.day01.reflect;

import com.day01.domain.Person;

import java.lang.reflect.Field;

/**
 * Created by yanyuchun on 2020/6/22
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        // 1、获取所有public成员变量
//        Field[] fields = personClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//
//        // 2、获取制定成员变量
        Field a = personClass.getField("a");
        System.out.println(a);

//         // 3、获取所有成员变量
//        Field[] allFields = personClass.getDeclaredFields();
//        for (Field field : allFields) {
//            System.out.println(field);
//        }

        // 4、 暴力反射
        Person p = new Person();
        // 普通反射
//        Field a = personClass.getField("a");

        a.set(p,"value_a");
        System.out.println(p);

        //暴力反射设置,此处获取方法不能用getField
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);
        d.set(p,"value_d");
        System.out.println(p);

    }
}
