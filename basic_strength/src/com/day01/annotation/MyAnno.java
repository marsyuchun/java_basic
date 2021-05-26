package com.day01.annotation;


public @interface MyAnno {
    int age();
    String name();
    String address() default "北京市朝阳区";
}
