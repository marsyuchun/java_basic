package basic_demo.day_10;

public class Dog implements Animal{
    @Override
    public void sleep() {
        System.out.println("Dog sleep in the night");
    }

    @Override
    public void eat() {
        System.out.println("Dog like eat bone");
    }

    public void behavior(){
        System.out.println("Dog catch thief");
    }
}
