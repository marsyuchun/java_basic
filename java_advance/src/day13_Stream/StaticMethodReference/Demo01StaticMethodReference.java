package day13_Stream.StaticMethodReference;

/**
 * Created by yanyuchun on 2020/6/1
 */
public class Demo01StaticMethodReference {
    public static int method(int num,Calcable calcable){
        return  calcable.absInt(num);
    }


    public static void main(String[] args) {
        int num = method(10, (n) -> Math.abs(n));
        System.out.println(num);

        // 使用方法引用
        int m = method(-110, Math::abs);
        System.out.println(m);
    }
}
