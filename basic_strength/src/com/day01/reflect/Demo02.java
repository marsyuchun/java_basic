package com.day01.reflect;

import com.day01.domain.Person;

import java.lang.reflect.Field;

/**
 * Created by yanyuchun on 2020/6/8
 * Class 对象的功能：
 * -获取功能
 * 1、获取成员变量们
     * Field[] getFields(); 获取所有public修饰的成员变量
     * Field getField(String name); 获取制定名称的public修饰的成员变量

     * Field[] getDeclareFields() 获取所有的成员变量，不考虑修饰符
     * Field getDeclareField(String name);
 * 2、获取构造方法们
 * Constructor<?>[] getConstructors()
 * Constructor<T> getConstructor(Class<?>... parameterTypes)

 * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
 * Constructor<?>[] getDeclaredConstructors()
 * 3、获取成员方法们
 * Method[] getMethods()
 *
 * 4、获取类名
 */
public class Demo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 1、获取Person的Class对象
        Class<Person> pc = Person.class;
//        Field[] fields = pc.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//
//        System.out.println("-------------------");
//
//        Field a = pc.getField("a");
//        // 获取成员变量a的值
        Person p = new Person();
//        a.set(p,"kevin");
//        Object o = a.get(p);
//        System.out.println(o);
//        System.out.println(p);

        System.out.println("-------------------");

        //  Field[] getDeclareFields() 获取所有的成员变量，不考虑修饰符
        Field[] fields1 = pc.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        // Field getDeclareField(String name)
        Field d = pc.getDeclaredField("d");
        // 忽略访问权限修饰符的安全检查，暴力反射
        d.setAccessible(true);
        Object o = d.get(p);
        System.out.println(o);

    }

}
