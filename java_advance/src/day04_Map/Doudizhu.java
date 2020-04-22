package day04_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by yanyuchun on 2020/4/6
 */
public class Doudizhu {
    public static void main(String[] args) {
        // 1、准备牌
        // 存储扑克牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        // 创建一个list，存储扑克牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        ArrayList<String> pokerValue = new ArrayList<>();
        // 定义
        ArrayList<String> ready = ready(pokerValue);
        for (int i = 0; i < ready.size(); i++) {
            poker.put(i, ready.get(i));
            pokerIndex.add(i);
        }
        // 2、 打乱牌的顺序
        Collections.shuffle(pokerIndex);
        // System.out.println(pokerIndex);

        // 3、 发牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) {
                diPai.add(in);
            } else if (i % 3 == 0) {
                player1.add(in);
            } else if (i % 3 == 1) {
                player2.add(in);
            } else if (i % 3 == 2) {
                player3.add(in);
            }
        }
        // 排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);

        // 4、 看牌
        showCard("刘备",player1,poker);
        showCard("孙权",player2,poker);
        showCard("曹操",player3,poker);
        showCard("底牌",diPai,poker);


    }

    private static void showCard(String name,ArrayList<Integer> list,HashMap<Integer, String> poker) {
        System.out.print(name+" ");
        for (Integer key : list) {
            System.out.print(poker.get(key)+", ");
        }
        System.out.println();
    }


    /**
     * 准备牌
     */
    private static ArrayList<String> ready(ArrayList<String> poker) {
        // 在扑克牌中加入大王、小王
        poker.add("大王");
        poker.add("小王");
        String[] colors = {"♥️", "♦️", "♣️", "♠️"};
        String[] numbers = {"2", "A", "K️", "️Q", "J", "️10", "️9", "8", "7", "️6", "5", "️4", "️3"};
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        return poker;
    }


}
