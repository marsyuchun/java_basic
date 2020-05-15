package day12_FunctionalInterface.Functional;

/**
 * Created by yanyuchun on 2020/5/9
 */
/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo01 {
    public static void show(Interface01 fd){
        fd.eat();
    }

    public static void main(String[] args) {
        // 传递接口的实现类
        show(new FunctionDemo01());

        // 传递匿名内部类
        show(new Interface01() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        });

        // lambda表达式实现
        show(()->System.out.println("lambda 函数式编程实现"));

        // 简化lambda表达式
    }
}
