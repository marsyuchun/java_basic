package factory;

public class App {
    public static void main(String[] args) {
        FoodFactory ChineseFood = new ChineseFoodFactory();

        Food food = ChineseFood.makeFood("A");
    }
}
