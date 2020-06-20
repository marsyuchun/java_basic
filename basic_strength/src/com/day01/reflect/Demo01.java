package com.day01.reflect;

import com.day01.domain.Person;

/**
 * Created by yanyuchun on 2020/6/2
 * 获取Class对象的三种方式
 */

public class Demo01 {
    /**
     * 1、Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
     * 多用于配置文件，将类名定义在配置文件中，读取文件，加载类
     * 2、类名.class: 通过类名的属性class获取
     * 多用于参数的传递
     * 3、对象.getClass()：getClass()方法在Object类中定义着
     * 多用于对象的获取字节码方式
     */

    public static void main(String[] args) throws ClassNotFoundException {
        // 方法1
        Class<?> person1 = Class.forName("com.day01.domain.Person");
        System.out.println(person1);

        // 方法2
        Class<Person> person2 = Person.class;
        System.out.println(person2);

        // 方法3
        Person p = new Person();
        Class<? extends Person> person3 = p.getClass();
        System.out.println(person3);

        System.out.println(person1 == person2);
        System.out.println(person3 == person2);
    }
    // 同一个字节码文件（*.class）再一次程序运行中，只会被加载一次，
}
