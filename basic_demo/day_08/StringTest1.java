package basic_demo.day_08;

public class StringTest1 {
    public static String arrayToString(int[] args) {
        String s = "[";
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                s = s.concat(args[i] + "]");
            } else {
                s = s.concat(args[i] + "#");
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String s1 = arrayToString(array);
        System.out.println(s1);
    }
}
