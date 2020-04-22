package day01_api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yanyuchun on 2020/3/22
 */

/**
 * public final static int YEAR = 1;
 * public final static int MONTH = 2;
 * public final static int WEEK_OF_YEAR = 3;
 * public final static int WEEK_OF_MONTH = 4;
 * public final static int DATE = 5;
 * public final static int DAY_OF_MONTH = 5;
 * public final static int DAY_OF_YEAR = 6;
 * public final static int DAY_OF_WEEK = 7;
 * public final static int DAY_OF_WEEK_IN_MONTH = 8;
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        // System.out.println(Calendar.getInstance());
        demo04();
    }


    /**
     * 获取date数据
     */
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(time);
        System.out.println(time);
        System.out.println(s);

    }

    /**
     * 在日期后加数据
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE,-45);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH)+1;
        System.out.println(month);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    /**
     * 设置日历的数据
     */
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,5);
        c.set(2008, 11, 23);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DATE);
        System.out.println(date);

    }

    /**
     * 获取日历的数据
     */
    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int date = c.get(Calendar.DATE);
        System.out.println(date);

    }

}
