package com.day01.domain;

/**
 * Created by yanyuchun on 2020/6/2
 */
public class Person {
    private String name;
    private int age;
    public String a;
    protected String b;
    String c;
    private String d;

    public Person(String name, int age, String a, String b) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("eat ...");
    }

    public void eat(String food){
        System.out.println("我想吃"+food);
    }
}
