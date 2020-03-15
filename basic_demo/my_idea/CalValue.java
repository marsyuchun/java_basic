package basic_demo.my_idea;

public class CalValue {
    public static void YearValue(double increase, int year,double init){
        for (int i = 0; i < year ; i++) {
            init = init * (increase+1);
        }
        System.out.println("一年后的收益为："+ init);
    }



    // 日息计算器，复利
    public static void dayValue(double increase, int day,double init){
        for (int i = 0; i < day ; i++) {
            init = init * (increase+1);
        }
        System.out.println("一年后的收益为："+ init);
    }

//    拆分利息
    public static void square(double x,int n){
        double y;
        y=StrictMath.pow(x,1.0/n);

        System.out.println(y);
    }


    public static void main(String[] args) {
        System.out.println("20年收益差距");
        dayValue(0.00027,365,1000);

        System.out.println("初始投资差距");


    }
}
