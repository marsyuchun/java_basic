package basic_demo.day02_dateType;

public class Ternary {

    public static int Factorial(int num){
            int sum = 1;
            if (num < 0){
                sum = -1024;
                return sum;
            }else if (num == 0){
                sum = 1;
                return sum;
            }else {
                for (int i=0;i<num;i++){
                    sum = sum * (num-i);
                }
                return sum;
            }
    }



    public static void main(String[] args) {
        Factorial(5);
    }
}
