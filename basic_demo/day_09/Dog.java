package basic_demo.day_09;

public class Dog extends AnimalAbstract{
    @Override
    public void eat(String name) {
        System.out.println(name+"喜欢吃骨头！");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("啸天犬");
        d.eat(d.getName());
    }
}
