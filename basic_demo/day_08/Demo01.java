package basic_demo.day_08;


import java.util.Arrays;

public class Demo01 {

    public static void main(String[] args) {
        // 创建字符串对象
        String s1 = "hello ";
        String s2 = "hello world!";
        String s = "hello world!";
        String s3 = "HELLO";
        String s5 = "0129";
        System.out.println(s5.charAt(3));


        char[] data = {'a','b','c','d','e','f','h'};
        String s4 = new String(data,2,4);
        System.out.println("s4:"+s4);
        System.out.println(s4.substring(0,2));
        // boolean equals(Object obj):比较字符串的内容是否相同
//        System.out.println(s2.toCharArray());
//        System.out.println(s2.toCharArray()[1]);
//
//        byte[] bytes = s.getBytes();
//        for(int x = 0; x < bytes.length; x++) {
//            System.out.print(bytes[x]+"--");
//        }
//       System.out.println(s1.concat(s2));
//       System.out.println(s3.length());
//
//        System.out.println(s1.charAt(2)+"leng");
//        System.out.println(s1.indexOf("le"));
//        System.out.println(s1.indexOf("ll"));
//        System.out.println(s2.substring(2));
//        System.out.println(s2.substring(2, 5));

        int[] arr = {1,2,3,4,3,22,34,31,3432};
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
