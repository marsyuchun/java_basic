package day05_ExceptionAndThread.Exception;

import java.util.Scanner;

/**
 * Created by yanyuchun on 2020/4/10
 */

/*
    要求：模拟注册操作，如果用户名已存在，则抛出异常并提示

    分析：
        1、使用数组保存已经注册过的用户名
        2、使用Scanner获取用户输入的用户名
        3、定义一个方法，对用户输入的用户名进行判断

 */
public class Demo09RegisterException {
    static String[] userNames = {"刘备","曹操","李白","孙权"};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = sc.next();
        try {
            checkParam(userName);
        }catch (RegisterException e){
            e.printStackTrace();
        }


    }

    private static void checkParam(String userName) {
        for (String name : userNames) {
            if (userName.equals(name)){
                throw new RegisterException("用户名已存在，请重新输入");
            }
        }
        System.out.println("用户名可以正常使用");
    }



}
