package basic_demo.day_08;

import java.util.Scanner;

public class StringTest02 {
    public static void countChar(String str){
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z'){
                smallCount=smallCount+1;
            }else if(ch>='A' && ch<='Z'){
                bigCount = bigCount+1;
            }else if (ch>='0' && ch<='9'){
                numberCount=numberCount+1;
            }else{
                System.out.println("输入字符非法："+str.charAt(i));
            }
        }
        System.out.printf("smallCount: %d ;bigCount : %d; numberCount : %d",smallCount,bigCount,numberCount);


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s= input.nextLine();
        countChar(s);

        int[] array = {1, 2, 3, 4, 5};
        String s1 = StringTest1.arrayToString(array);
        System.out.println(s1);

    }
}
