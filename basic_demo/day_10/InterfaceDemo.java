package basic_demo.day_10;

public class InterfaceDemo {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sleep();
        cat.eat();
        Animal dog = new Dog();
        dog.eat();
        System.out.println(cat instanceof Dog);
        System.out.println(cat instanceof Cat);

    }
}
