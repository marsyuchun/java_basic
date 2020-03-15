package basic_demo.day_10;

public interface USBInterface {
    default void open(){
        System.out.println("USB连接打开了！");
    }

    default void close(){
        System.out.println("USB连接关闭了");
    };




}
