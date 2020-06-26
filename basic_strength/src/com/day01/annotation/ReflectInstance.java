package com.day01.annotation;

import java.lang.reflect.Method;

/**
 * Created by yanyuchun on 2020/6/22
 * 需求：
 *      写一个框架，可以帮我们创建任意类的对象，并且执行其中任意方法
 *
 */
@ReflectAnnotaiton(className = "com.day01.annotation.ReflectDemo1", methodName ="show" )
public class ReflectInstance {
    public static void main(String[] args) throws Exception {
        /*
            可以创建任意类的对象，可以执行任意方法
         */
        // 1、 解析注解
        Class<ReflectInstance> ref = ReflectInstance.class;
        // 2、获取上边的注解对象 ，生成了注解的子类对象
//        * getAnnotation(Class)
//        //其实就是在内存中生成了一个该注解接口的子类实现对象
//
//        public class ProImpl implements Pro{
//            public String className(){
//                return "cn.itcast.annotation.Demo1";
//            }
//            public String methodName(){
//                return "show";
//            }
//        }
        ReflectAnnotaiton an = ref.getAnnotation(ReflectAnnotaiton.class);

        //2、获取注解配置的类和方法
        String className = an.className();
        String methodName = an.methodName();

        // 3、加载类进内存
        Class cls = Class.forName(className);

        // 4、创建对象
        Object o = cls.newInstance();

        // 5、获取类方法
        Method method = cls.getMethod(methodName);

        // 调用方法
        method.invoke(o);


    }

}
