package basic_demo.day02_dateType;

public class Symbol {
    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }

    public static void main(String[] args) {
        byte b1=1;
        byte b2=2;
        byte b3= 1 + 2;
        int b4= b1 + b2;
        System.out.println(b3);
        System.out.println(b4);
    }
}
