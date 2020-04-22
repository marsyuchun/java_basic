package day02_collection.generic;

/**
 * Created by yanyuchun on 2020/3/31
 */
public class TestInterface {
    public static void main(String[] args) {
        GenericInterfaceImp1 g1 = new GenericInterfaceImp1();
        g1.add("name");
        System.out.println(g1.getE());


        GenericInterfaceImpl2 g2 = new GenericInterfaceImpl2();
        g2.add("name");
        System.out.println(g2.getE());



    }
}
