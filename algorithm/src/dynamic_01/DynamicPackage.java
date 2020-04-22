package dynamic_01;

import org.junit.Test;

/**
 * Created by yanyuchun on 2020/4/15
 * 假设山洞里共有a,b,c,d ,e这5件宝物（不是5种宝物），
 * 它们的重量分别是2,2,6,5,4，它们的价值分别是6,3,5,4,6，现在给你个承重为10的背包,
 * 怎么装背包，可以才能带走最多的财富。
 */

public class DynamicPackage {
    int[] values ={0,6,4,5,3,6};
    int[] volume ={0,4,5,6,2,2};
    int bag = 10;
    int[] item  = new int[values.length];
    int[][] dp = bestChoice(values, volume, bag);
    
    @Test
    public void test(){
//        bestChoice(values, volume, bag);
        ChoiceList(values.length-1,bag);
        print();

    }

    private void print() {
        for (int i = 0; i < item.length ; i++) {
            if (item[i]==1){
                System.out.print(values[i]+", ");
            }
        }
    }

    private void ChoiceList(int i, int j) {
        if (i>0){
            if (dp[i][j]==dp[i-1][j]){
                item[i]=0;
                ChoiceList(i-1,j);
            }else if (j-volume[i]>0&& dp[i][j]==(dp[i-1][j-volume[i]]+values[i])){
                item[i] = 1;
                ChoiceList(i-1,j-volume[i]);
            }
        }
    }


    private static int[][] bestChoice(int[] Value, int[] V, int bag) {
        int[][] dp = new int[Value.length][bag+1];
        for (int i = 1; i < Value.length ; i++) {
            for (int j = bag; j >= 1  ; j--) {
                if ( j< V[i]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-V[i]]+Value[i]);
//                    result[j] = Math.max(result[j],result[j-V[i]]+Value[i]);
                }
            }
        }

        // 动态规划表输出
        System.out.println("最大价值为"+dp[Value.length-1][bag]);
        return dp;

    }

    private static void printarr(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print("[");
            for (int j = 0; j <dp[i].length; j++) {
                System.out.print(dp[i][j]+",    ");
            }
            System.out.println("]");
        }
    }




}
