package basic_demo.day_08;

public class MathDemo {
    public static void main(String[] args) {
        // public static double abs(double a) :返回 double 值的绝对值。
        double d1 = Math.abs(-5.4);
        System.out.println(d1);

        //  public static double ceil(double a) :返回大于等于参数的最小的整数。
        double d2 = Math.ceil(3.1);
        System.out.println(d2);

        // public static double floor(double a) :返回小于等于参数最大的整数。
        double d3 = Math.floor(3.9);
        System.out.println(d3);

        // public static long round(double a) :返回最接近参数的 long。(相当于四舍五入方法)

        double d4 = Math.round(3.51);
        double d5 = Math.round(3.49);
        System.out.println(d4);
        System.out.println(d5);
    }
}
