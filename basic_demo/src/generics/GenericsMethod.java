package generics;

public class GenericsMethod {
    public static <E> void printArray(E[] array){
        for (E element: array){
            System.out.printf("%s",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6,7};
        Character [] charArray = {'a','b','c','d','r'};
        String [] strArray = {"name","email","address"};

        printArray(intArray);
        printArray(charArray);
        printArray(strArray);
    }
}
