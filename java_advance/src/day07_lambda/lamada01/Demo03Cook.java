package day07_lambda.lamada01;

/**
 * Created by yanyuchun on 2020/4/20
 */
public class Demo03Cook {
    public static void main(String[] args) {
        // 匿名内部类
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了！");
            }
        });

        // lambda表达式
        invokeCook(()-> System.out.println("吃饭了～"));


    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
