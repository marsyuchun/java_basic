package singleton;

import java.util.Date;

public class singleDemo {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        System.out.println((new Date()).getTime());
    }
}
