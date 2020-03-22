package day01_api;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by yanyuchun on 2020/3/22
 */
public class Demo01toString {
    public static void main(String[] args) {
        Person p1 = new Person("黄忠",70);
        Person p2 = new Person("张飞",40);
        System.out.println(p1.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        Random rd = new Random();
        System.out.println(rd);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));
        System.out.println(sc.equals(p1));

    }

}
