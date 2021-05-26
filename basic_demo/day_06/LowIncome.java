package basic_demo.day_06;


/**
 * Created by yanyuchun on 2020/7/30
 */
public class LowIncome {
    public static void main(String[] args) {
        double increase = increase(20, 3000);
        System.out.println(increase);
    }

    public static double increase(int year, float income) {

        System.out.println();
        double result = 0;
        for (int i = 0; i < year * 12; i++) {
            result = result * (1+0.18/12) + income;
        }
        return result;
    }
}
