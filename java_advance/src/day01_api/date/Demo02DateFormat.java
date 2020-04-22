package day01_api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yanyuchun on 2020/3/22
 */
public class Demo02DateFormat {
    public static void main(String[] args) {
        demo01();
        demo02();
    }


    /**
     *格式化日期时间
     */
    private static void demo02() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒");
        String s = sdf.format(new Date());
        System.out.println(new Date());
        System.out.println(s);
    }

    /**
     * 解析日期时间
     */
    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒");
        try {
            sdf.parse("2020年03月22日 17时:56分:02秒");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
