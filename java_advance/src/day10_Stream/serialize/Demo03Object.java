package day10_Stream.serialize;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by yanyuchun on 2020/5/4
 */
public class Demo03Object {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("孙权",40,"吴");
        Person p2 = new Person("曹操",54,"魏");
        Person p3 = new Person("刘备",52,"蜀");
        list.add(p1);
        list.add(p2);
        list.add(p3);
//        serializeList(list);
        deSerializeList();
    }

    private static void deSerializeList() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java_advance/src/day10_Stream/serialize/Demo03.class"));
        Object o = ois.readObject();
        ArrayList<Person> list = (ArrayList<Person>) o;
        for (Person person : list) {
            System.out.println(person.toString());
        }

    }

    private static void serializeList(ArrayList<Person> list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java_advance/src/day10_Stream/serialize/Demo03.class"));
        oos.writeObject(list);
        oos.close();
    }
}
