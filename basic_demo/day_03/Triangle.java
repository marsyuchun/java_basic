package basic_demo.day_03;

public class Triangle {
    public static void delta(int lan) {
        for (int i = 1; i <= 2 * lan + 1; i++) {
            if (i % 2 == 1) {
                for (int a = lan - i; a > 0; a = a - 2) {
                    System.out.print("\u2000");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    public static void delta1(int lan) {
        for (int i = 1; i <= 2 * lan + 1; i++) {
            if (i % 2 == 1) {
                for (int a = lan - ((i - 1) / 2); a > 0; a--) {
                    System.out.print("\u2000");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        delta1(3);
        delta1(4);
    }
}
