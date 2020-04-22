package day01_api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by yanyuchun on 2020/3/22
 */
public class TestClcDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期，格式为yyyy-MM-dd");
        String birthday = sc.nextLine();
        int totalDays =  clcDays(birthday);
        System.out.println(totalDays);
    }

    /**
     *
     * @Author: yuchun.yan on 2020/3/22 18:08
     * @param: [date]
     * @return: int
     * @Description:
     */
    private static int clcDays(String birthday) {
        int totalDays=0;
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Long l ;
        try {
            sdf.parse(birthday).getTime();
            l = dt.getTime() - sdf.parse(birthday).getTime();
            if (l<0){
                System.out.println("你开玩笑吧，你还没出生呢！！！");
            }else {
                Long s = l/(1000*3600*24);
                totalDays = (int) Math.floor(s);
                System.out.println("你好，你从出生到现在已经："+totalDays+"天了");
                System.out.println(10842-totalDays);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return totalDays;
    }

}
