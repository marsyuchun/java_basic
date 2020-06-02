package day13_Stream.ThisReference;

/**
 * Created by yanyuchun on 2020/6/1
 * 通过this 引用本类的成员方法
 */
public class Husband {
    // 定义一个买房子的成员方法
    public void buyHouse(){
        System.out.println("买一套四合院！");
    }

    // 定义一个旅行接口
    public void marry(Richable r){
        r.buy();
    }

    public void soHappy(){
//        marry(()-> this.buyHouse());
        marry(this::buyHouse);
    }


    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
