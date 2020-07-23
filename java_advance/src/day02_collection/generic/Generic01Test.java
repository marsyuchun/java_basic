package day02_collection.generic;

/**
 * Created by yanyuchun on 2020/3/31
 */
public class Generic01Test {
    public static void main(String[] args) {
        Generic01<String> gs = new Generic01<>("庄子");
        System.out.println(gs.getName());
        gs.setName("墨子");
        String name = gs.getName();
        System.out.println(name);

        Generic01<Integer> gi= new Generic01<>(250);
        System.out.println(gi.getName());
        gi.setName(007);
        int na  = gi.getName();
        System.out.println(na);

    }
}
