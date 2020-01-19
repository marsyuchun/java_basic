package singleton;

import java.util.Date;

public class Singleton {
    // 先堵死 new Singleton
    private Singleton(){

    }

    // 创建私有静态类
    private static Singleton instance = new Singleton();


    public static Singleton getInstance() {
        return instance;
    }
    // 可能导致的问题
    public static Date getDate(String mode){
        return new Date();
    }
}
