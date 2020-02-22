package basic_demo.day_04;

public class Reload {
    public static void open(){};
    public static void open(int a){};
    static void open(int a,int b){};
    public static void open(double a,int b){};
    public static void open(int a,double b){};;
    public static void OPEN(){};

    public static <T> void  print( T e){
        System.out.println(e);
    }





    public static void main(String[] args) {
        print("name");
        print(123);
        print(true);
    }
}
