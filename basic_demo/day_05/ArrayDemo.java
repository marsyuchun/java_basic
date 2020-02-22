package basic_demo.day_05;

public class ArrayDemo {
    public static <T> void print(T[] array){
        for (int i =0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        Boolean[] arry1 = new Boolean[4];
        Integer[] arry2 = new Integer[]{1,2,3,4,5};
        Double[] arry3 = new Double[5];
        print(arry1);
        print(arry2);
        print(arry3);

    }
}
