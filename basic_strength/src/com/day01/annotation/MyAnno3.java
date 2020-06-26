package com.day01.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *     元注解：作用在注解上的注解叫做元注解，有四个
 *         1、@Target ：描述注解能够作用的位置
 *              * ElementType
 *                  TYPE：只可以作用于类上
 *                  METHOD：只可以作用于方法上
 *                  FIELD ：只可以作用于成员变量上
 *         2、@Retention ： 描述注解被保留的阶段
 *              * @Retention(RetentionPolicy.RUNTIME) 当前被描述的注解，会保留到class字节码文件中，并被jvm读取到
 *         3、@Documented ： 描述注解是否被抽取到API文档中
 *         4、@Inherited  ： 描述注解是否被子类继承
 *
*/
@Target(value = ElementType.TYPE)// 表示该myAnno3注解只能作用在类上
@Retention(RetentionPolicy.RUNTIME)// 表示该myAnno3注解只能作用在RUNTIME阶段
public @interface MyAnno3 {
}
