package com.day01.reflect;

import com.day01.domain.Person;

import java.lang.reflect.Method;

/**
 * Created by yanyuchun on 2020/6/22
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Method eat = personClass.getMethod("eat");
        Person p = new Person();
//        eat.invoke(p);

        Method eat1 = personClass.getMethod("eat", String.class);
//        eat1.invoke(p,"湖南米粉");

        Method[] methods = personClass.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method);
        }

        String name = personClass.getName();
        System.out.println(name);
    }
}
