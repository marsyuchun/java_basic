package com.day01.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by yanyuchun on 2020/6/22
 * 需求：
 *      写一个框架，可以帮我们创建任意类的对象，并且执行其中任意方法
 *
 */
public class ReflectInstance {
    public static void main(String[] args) throws Exception {
        // 可以创建任意类的对象，可以执行任意方法
//        Person p = new Person();
//        p.eat();
        /**
         * 不能改变该类的任何代码，可以创建任意类对象，可以执行任意方法
         * 实现：
         * 1、配置文件
         * 2、反射
         * 步骤：
         */
        // 1、加载配置文件
        // 创建properties对象
        Properties properties = new Properties();
        // 获取类加载器
        ClassLoader classLoader = ReflectInstance.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("classConfig.properties");
        properties.load(is);
        System.out.println(properties);

        // 2、 获取配置文件中的定义
        String class_name = properties.getProperty("class_name");
        String method_name = properties.getProperty("method_name");

        // 3、加载类进内存
        Class cls = Class.forName(class_name);

        // 4、创建对象
        Object o = cls.newInstance();

        // 5、获取方法对象
        Method method = cls.getMethod(method_name,String.class);

        // 6、执行对象
        method.invoke(o,"米粉");

    }

}
