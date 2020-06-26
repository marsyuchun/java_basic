package com.day01.annotation.demo;

/**
 * Created by yanyuchun on 2020/6/22
 */
public class Calculator {

    @Check
    public void add() {
        System.out.println("1+0=" + (1 + 0));
    }

    @Check
    public void sub() {
        System.out.println("1-0=" + (1 - 0));
    }

    @Check
    public void mul() {
        System.out.println("1*0=" + (1 * 0));
    }

    @Check
    public void div() {
        System.out.println("1/0=" + (1 / 0));
    }

    @Check
    public void str(){
        String s =null;
        s.toString();
    }

    public void show(){
        System.out.println("不会写bug...");
    }
}
