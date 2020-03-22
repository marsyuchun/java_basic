package basic_demo.day_11;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            if (i%3==0){
                list.add(i);
            }
        }
        System.out.println(list);
        getEvenNumber(list);
        System.out.println(getEvenNumber(list));
    }

    // 获取所有的偶数
    public static List<Integer> getEvenNumber(List<Integer> list){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)%2 ==0){
                arr.add(list.get(i));
            }
        }
        return arr;
    }
}
