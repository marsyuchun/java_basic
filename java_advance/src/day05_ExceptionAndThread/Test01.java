package day05_ExceptionAndThread;

import java.util.LinkedList;

/**
 * Created by yanyuchun on 2020/4/8
 */
public class Test01 {
    public static void main(String[] args) {
        LinkedList<Long> list = new LinkedList<>();

        for (int i = 0; i < 30; i++) {
            long fibonacci = fibonacci(i);
            list.addLast(fibonacci);
        }
        System.out.println(list);

        long start = System.currentTimeMillis();
        long fibonacci = fibonacci(50);
        long end = System.currentTimeMillis();
        System.out.println(fibonacci);
        System.out.println(end - start);
    }

    private static long fibonacci(int i) {
        return i <= 1 ? i : fibonacci(i - 2) + fibonacci(i - 1);
    }


}
