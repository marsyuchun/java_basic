package com.day01.annotation;

/**
 * Created by yanyuchun on 2020/6/22
 *
 * 格式：
 *      元注解：
 *      public @interface 注解名称 {}
 *
 *      本质：注解本质就是一个接口，默认继承Annotation接口
 *      public interface com.day01.annotation.AnnotationDemo extends java.lang.annotation.Annotation {}
 */

public @interface AnnotationDemo {
    /*
    注解的属性可以有以下五种
    1、基本类型
    2、String类型
    3、枚举
    4、注解
    5、以上四个的数组
     */
//    int value();
//    int age() default  12;
//    String name() default "Kevin";
    Employee e();
    MyAnnotation my();
    String[] strs();



}
