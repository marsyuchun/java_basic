package basic_demo.day_10;

public class Cat implements Animal {
    @Override
    public void sleep() {
        System.out.println("Cat sleep in the daytime");
    }

    @Override
    public void eat() {
        System.out.println("Cat  like eat fish");
    }

    public void behavior(){
        System.out.println("Cat catch mouse");
    }

}
