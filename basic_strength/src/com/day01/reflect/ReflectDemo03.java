package com.day01.reflect;

import com.day01.domain.Person;

import java.lang.reflect.Constructor;

/**
 * Created by yanyuchun on 2020/6/21
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getDeclaredConstructor(String.class, int.class);

        System.out.println(constructor);
        Object person = constructor.newInstance("kevin", 30);
        System.out.println(person);

        System.out.println("===============================");
        Person person1 = Person.class.newInstance();
        System.out.println(person1);


    }
}
