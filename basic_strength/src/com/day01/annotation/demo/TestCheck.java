package com.day01.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by yanyuchun on 2020/6/23
 */
/*
    简单测试框架：
    当主方法执行后，会自动执行被检测的所有方法（加了check注解的方法），判断方法是否有异常，将异常记录到文件中

 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1、创建计算器类对象，获取字节码对象
        Calculator c = new Calculator();
        Class cls = c.getClass();

        // 2、获取字节码对象的所有方法
        Method[] methods = cls.getMethods();

        // 出现异常记录
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/day01/annotation/demo/bug.txt",true));

        for (Method method : methods) {
            // 3、判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName()+"方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("===========================");
                }
            }
        }
        bw.newLine();
        bw.write("本次一共出现"+number+"次异常");
        bw.flush();
        bw.close();

    }
}
