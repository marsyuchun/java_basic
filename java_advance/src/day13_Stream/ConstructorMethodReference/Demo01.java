package day13_Stream.ConstructorMethodReference;

/**
 * Created by yanyuchun on 2020/6/1
 * <p>
 * 类的构造器
 */
public class Demo01 {
    // 定义一个方法，创建Person对象
    public void printName(String name, PersonBuilder pb) {
        Person person = pb.builderPerson(name);
        System.out.println(person);
    }

    public static void main(String[] args) {
        // 调用printName方法
        new Demo01().printName("黄忠", (String name) -> new Person(name));

    /*
    使用引用方法优化lambda表达式
    构造方法new Person（String name） 已知
    构建对象已知
    就可以使用Person 引用new创建对象
     */
        new Demo01().printName("刘备",Person::new);

    }
}
