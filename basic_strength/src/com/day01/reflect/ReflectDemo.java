package com.day01.reflect;

import com.day01.domain.Person;

/**
 * Created by yanyuchun on 2020/6/21
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1、 Class.forName（）一般适用于配置文件
        Class person1 = Class.forName("com.day01.domain.Person");
        System.out.println(person1);
        //2、用于参数传递的 类名.class
        Class person2 = Person.class;
        System.out.println(person2);

        // 3、对象.getClass（）获取，用于
        Person p = new Person();
        Class person3 = p.getClass();
        System.out.println(person3);


    }
}
