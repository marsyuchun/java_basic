package testrevert;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by yanyuchun on 2020/5/28
 */
public class TestNum implements Serializable {
    final AtomicLong seed;

    public TestNum(AtomicLong seed) {
        this.seed = seed;
        System.out.println(seed);
    }

    public static void main(String[] args) {
    }
}
