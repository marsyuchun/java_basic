package day07_lambda.lambda03;

/**
 * Created by yanyuchun on 2020/4/20
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(100, 25, new Calculator() {
            @Override
            public int Calculator(int a, int b) {
                return a + b;
            }
        });

        invokeCalc(100, 125, (a, b) -> a + b);

    }

    public static void invokeCalc(int a, int b, Calculator calc) {
        int sum = calc.Calculator(a, b);
        System.out.println("两数的和为：" + sum);
    }
}
