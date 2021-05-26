package com.day01.annotation;

/**
 * Created by yanyuchun on 2020/6/22
 */
@SuppressWarnings("all")
public class Demo01 {

    // 1、 override注解，表示重写
    @Override
    public String toString() {
        return super.toString();
    }

    // 2、deprecated注解 ，表示过时
    @Deprecated
    public void show() {
        System.out.println("show 1");
    }

    public void show2() {
        System.out.println("the new method show");
    }



    public static void main(String[] args) {
        Demo01 demo = new Demo01();
        demo.show2();
        demo.show();
    }

}
