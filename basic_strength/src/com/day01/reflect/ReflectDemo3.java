package com.day01.reflect;

import com.day01.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by yanyuchun on 2020/6/9
 *
 *  * 2、获取构造方法们
 *  * Constructor<?>[] getConstructors()
 *  * Constructor<T> getConstructor(Class<?>... parameterTypes)
 *
 *  * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
 *  * Constructor<?>[] getDeclaredConstructors()
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Person person = constructor.newInstance("kevin", 29);

        System.out.println(person);

        System.out.println("------------------------");
        Constructor<Person> constructor1 = personClass.getConstructor();
        Person person1 = constructor1.newInstance();

        System.out.println(person1);


    }

}
