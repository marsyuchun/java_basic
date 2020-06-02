package day13_Stream.ConstructorMethodReference;

/**
 * Created by yanyuchun on 2020/6/1
 */
public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
