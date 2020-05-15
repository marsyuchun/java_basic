package day10_Stream.serialize;

import java.io.*;

/**
 * Created by yanyuchun on 2020/5/3
 */
public class Demo01Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serialize();
        deSerialize();
    }

    private static void deSerialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java_advance/src/day10_Stream/serialize/serialize"));
        Object o = ois.readObject();
        ois.close();
        if (o instanceof Person){
            Person p = (Person) o;
            System.out.println(p.toString());
        }else {
            System.out.println("不可以转换");
        }



    }

    private static void serialize() throws IOException {
        Person p1 = new Person("特朗普", 47, "American");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java_advance/src/day10_Stream/serialize/serialize"));
        oos.writeObject(p1);
        oos.close();
    }


}
