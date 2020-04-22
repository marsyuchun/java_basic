package day01_api.date;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * Created by yanyuchun on 2020/3/30
 */
public class DemoLocalDateTime {
    public static void main(String[] args) {
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss");
        System.out.println(sdf.format(dt));
        System.out.println(dt);
    }
}
