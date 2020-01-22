package generics;

public class MixMinTest {
    public static <T extends Comparable<T>> T maxMin(T x, T y, T z){
        T max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }


    public static void main(String[] args) {
        maxMin("name","time","address");
    }
}
