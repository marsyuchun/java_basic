package com.day01.test;

import com.day01.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yanyuchun on 2020/6/2
 */
public class CalculatorTest {

    /**
     * 初始化方法：
     * 用于资源申请，所有测试方法在执行之前都会先执行该方法
     *
     */
    @Before
    public void init(){
        System.out.println("init....");

    }

    /**
     * 释放资源方法
     * 测试执行完后释放资源
     */
    @After
    public void close(){
        System.out.println("close.....");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        System.out.println("测试执行了");
        // 1、创建对象
        Calculator c = new Calculator();
        // 2、调用add方法
        int add = c.add(998, 1);
        // 3、断言类
        Assert.assertEquals(999, add);
    }



}
