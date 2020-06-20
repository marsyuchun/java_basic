package com.day01.reflect;

import com.day01.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by yanyuchun on 2020/6/9
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 获取Person的Class对象
        Class<Person> personClass = Person.class;
        // 获取指定名称的方法
        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        // 执行方法
        eat.invoke(p);

        Method eat2 = personClass.getMethod("eat",String.class);
        eat2.invoke(p,"寿司");

        System.out.println("------------------------");

        // 获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }


    }

}
