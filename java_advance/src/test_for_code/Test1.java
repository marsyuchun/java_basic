package test_for_code;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by yanyuchun on 2020/5/15
 */
public class Test1 {
    public static void main(String[] args) {
        BigDecimal b[] = {
                new BigDecimal(new BigInteger("10")),
                new BigDecimal(new BigInteger("20")),
                new BigDecimal(new BigInteger("30")),
                new BigDecimal(new BigInteger("40")),
                new BigDecimal(new BigInteger("50")),

        };
        for (BigDecimal bigDecimal : b) {
            System.out.println(bigDecimal);
        }
        System.out.println(Arrays.asList(b));

    }

}
