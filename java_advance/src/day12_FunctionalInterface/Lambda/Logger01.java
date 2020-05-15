package day12_FunctionalInterface.Lambda;

/**
 * Created by yanyuchun on 2020/5/9
 */
/*
    使用lambda优化日志案例
    lambda函数的优点
 */
public class Logger01 {
    // 定义一个方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level, MessageBuilder ms) {
        if (level == 1) {
            System.out.println(ms.BuilderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello ";
        String msg2 = "Hello Java ";
        String msg3 = "Hello Wormpex! ";
        showLog(1, () ->{
            System.out.println("满足条件会执行");
            return msg1+msg2+msg3;
        } );
        showLog(2, () ->{
            System.out.println("不满足条件不会执行");
           return msg1+msg2+msg3;
        } );
    }
}
