package generics;


import java.util.ArrayList;

public class Box <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        Box<String> strBox = new Box<>();
        Box<ArrayList> listBox = new Box<>();
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(5);
        list.add("name");


        listBox.setT(list);
        intBox.setT(3);
        strBox.setT("name");
        System.out.println(listBox.getT());
        System.out.println(intBox.getT());
        System.out.println(strBox.getT());
    }
}
