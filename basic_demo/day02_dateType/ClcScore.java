package basic_demo.day02_dateType;

public class ClcScore {
    public static void ClcScore(int score){
        if (score > 100 || score < 0){
            System.out.println("输入成绩不合法！！");
        }else if ( score>=90 && score <=100 ){
            System.out.println("优秀！！");
        }else if ( score>=80 && score <=89 ){
            System.out.println("好！！");
        }else if ( score>=70 && score <=79 ){
            System.out.println("良！！");
        }else if ( score>=60 && score <=69 ){
            System.out.println("及格！！");
        }else {
            System.out.println("垃圾！！");
        }
    }

    public static void main(String[] args) {
        ClcScore(96);
    }
}
