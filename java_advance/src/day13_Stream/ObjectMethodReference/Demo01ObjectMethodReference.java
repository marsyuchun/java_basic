package day13_Stream.ObjectMethodReference;

/**
 * Created by yanyuchun on 2020/6/1
 */
/*
    通过对象名引用成员方法
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable pr){
        pr.print("Hello");
    }

    public static void main(String[] args) {
        // 调用printString 方法，方法的参数Printable是一个函数式接口，可以传递lambda
        printString(s->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });


        // 对象名引用成员方法,前提是引用的方法和引用的对象都存在
        MethodRerObject obj2 = new MethodRerObject();
        printString(obj2::printUpperCaseString);
    }
}
