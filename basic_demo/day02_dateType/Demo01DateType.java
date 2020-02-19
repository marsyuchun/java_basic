package basic_demo.day02_dateType;

public class Demo01DateType {
    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }

    public static void main(String[] args) {

        short a = 32132;
        short b = 32;
        short c = 32132;

        System.out.println(a+b);
        System.out.println(getType(a+c));
    }

}
