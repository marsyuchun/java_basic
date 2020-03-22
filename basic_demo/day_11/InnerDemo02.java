package basic_demo.day_11;

public class InnerDemo02 {

    public static void main(String[] args) {
        FlyAble f1 = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("没有翅膀也能飞");
            }
        };
        showFly(f1);

        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("飞的很快的鸟");
            }
        });
    }

    public static void showFly(FlyAble f){
        f.fly();
    }
}
