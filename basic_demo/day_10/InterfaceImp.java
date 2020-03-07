package basic_demo.day_10;

public class InterfaceImp implements InterfaceName{
    @Override
    public void method() {

    }

    @Override
    public void method1() {
        System.out.println("method1 run 111");
    }

    public static void main(String[] args) {
        InterfaceImp i = new InterfaceImp();
        i.method1();
    }
}
