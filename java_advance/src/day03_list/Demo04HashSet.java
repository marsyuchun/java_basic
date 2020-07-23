package day03_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yanyuchun on 2020/4/2
 */
public class Demo04HashSet {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("h");
        str.add("e");
        str.add("l");
        str.add("l");
        str.add("o");
        Set<String> Set = new HashSet<>(str);
        System.out.println(Set);


    }
}
