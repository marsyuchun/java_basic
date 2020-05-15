package day12_FunctionalInterface.Lambda;

/**
 * Created by yanyuchun on 2020/5/9
 */
/*
    发现以下代码存在性能浪费问题
    调用showLog方法，传递的第二个参数是一个拼接后的字符串
    如果日志等级不为1，则不会打印，日志就白拼接了，存在性能浪费
 */
public class Logger {
    // 定义一个根据日志的级别显示日志信息
    public static void showLog(int level,String msg){
        if (level==1){
            System.out.println(msg);
        }
    }


    public static void main(String[] args) {
        String msg1 = "Hello ";
        String msg2 = "Hello Java ";
        String msg4 = "Hello Wormpex! ";
        showLog(1,msg1+msg2+msg4);
    }
}
