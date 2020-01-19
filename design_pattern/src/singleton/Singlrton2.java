package singleton;

public class Singlrton2 {
    private Singlrton2(){};
    // 首先，也是先堵死 new Singleton() 这条路
    private static volatile Singlrton2 instance = null;

    public static Singlrton2 getSingle2() {
        if (instance == null){
            // 加锁
            synchronized (Singlrton2.class){
                // 这一次判断也是必须的，不然会有并发问题
                if (instance == null){
                    instance = new Singlrton2();
                }
            }
        }
        return instance;
    }
}
