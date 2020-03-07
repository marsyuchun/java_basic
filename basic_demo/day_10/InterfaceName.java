package basic_demo.day_10;

public interface InterfaceName {
    public abstract void method();

    public default void method1(){
        System.out.println("method1 run ");
    }

    public static void method2(){
        System.out.println("method2 run ");
    }

}
