package basic_demo.day_02;

public class Switch {
    public static void dateClc(int weekday){
        switch (weekday){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入数据有问题");
                break;
        }
    }

    public static void main(String[] args) {
        dateClc(4);

    }
}
