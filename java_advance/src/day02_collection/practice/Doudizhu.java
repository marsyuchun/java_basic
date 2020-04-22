package day02_collection.practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by yanyuchun on 2020/3/31
 * 斗地主综合案例：
 * 1、准备牌
 * 2、洗牌
 * 3、发牌
 * 4、看牌
 *
 */
public class Doudizhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        poker = ready(poker);
        // System.out.println(poker);
        xipai(poker);

        // 发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i <poker.size() ; i++) {
            if (i>=51){
                dipai.add(poker.get(i));
            }else if(i%3==0){
                player1.add(poker.get(i));
            }else if(i%3==1){
                player2.add(poker.get(i));
            }else if(i%3==2){
                player3.add(poker.get(i));
            }
        }

        // 看牌
        System.out.println("冷晴："+player1);
        System.out.println("冷小胖"+player2);
        System.out.println("冷大胖"+player3);
        System.out.println("底牌"+dipai);

    }



    // 洗牌
    private static ArrayList<String> xipai(ArrayList<String> poker) {
        Collections.shuffle(poker);
        return poker;
    }

    /**
     * 准备牌
     */
    private static ArrayList<String> ready(ArrayList<String> poker) {
        // 在扑克牌中加入大王、小王
        poker.add("大王");
        poker.add("小王");
        String[] colors = {"♥️","♦️","♣️","♠️"};
        String[] numbers = {"2","A","K️","️Q","J","️10","️9","8","7","️6","5","️4","️3"};
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number);
            }
        }
        return poker;
    }


}
