package basic_demo.day_06;

public class test {
    public static void main(String[] args) {
        Model model1 = new Model(22,"柳岩");
        model1.setCup('E');
        System.out.println("model1的名字为："+model1.getName()+"\ncup 大小为："+model1.getCup());
    }
}
