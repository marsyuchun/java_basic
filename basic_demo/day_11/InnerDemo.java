package basic_demo.day_11;

public class InnerDemo {


    public static void main(String[] args) {
        FlyAble f = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("这是个可以飞的东西！");
            }
        };
        f.fly();
    }

}
