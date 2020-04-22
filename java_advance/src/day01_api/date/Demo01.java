package day01_api.date;

import java.util.Date;

/**
 * Created by yanyuchun on 2020/3/22
 */
public class Demo01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(0L);
        System.out.println(d2);
        System.out.println(d2.getClass());
        System.out.println(d1.getTime());

    }

}
