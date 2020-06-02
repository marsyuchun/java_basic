package day13_Stream.ConstructorMethodReference;

/**
 * Created by yanyuchun on 2020/6/1
 * 定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    // 定义一个方法，根据传递的姓名，创建person对象
    Person builderPerson(String name);
}
