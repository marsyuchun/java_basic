package day05_ExceptionAndThread.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yanyuchun on 2020/4/8
 */
public class Demo01Exception {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("start:");
            Date date = sdf.parse("1991-0722");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }


}
