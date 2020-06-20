package work_test.utils_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by yanyuchun on 2020/6/4
 */
public class SafeOfList {

    public static <T> List<T> of(List<T> source) {
        return (List) Optional.ofNullable(source).orElse(new ArrayList<>(3));
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(-4);
        strings.add("name");
        strings.add("name");
        strings.add("name");
        strings.add("name");
        System.out.println(strings);
    }

}
