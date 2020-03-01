package basic_demo.day_08;

public class MathTest {
    /**
     * 使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个?
     * @param a
     * @param b
     */
    public static void clcNumber(double a,double b ){
        int count = 0;
        int min;
        int max;
        if (a<=b){
            min = (int) Math.ceil(a);
            max = (int) Math.floor(b);
        }else {
            min = (int) Math.ceil(b);
            max = (int) Math.floor(a);
        }
        for (int x = min;x<max;x++){
            if (Math.abs(x)>6 || Math.abs(x)<2.1){
                count=count+1;
                System.out.print(x+"====");
            }
        }
        System.out.println();
        System.out.println("共有"+count+"个符合要求的数字");
    }

    public static void main(String[] args) {
        clcNumber(-10.8,5.9);
    }
}
