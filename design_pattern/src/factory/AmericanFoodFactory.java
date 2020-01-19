package factory;

public class AmericanFoodFactory implements FoodFactory{

    @Override
    public Food makeFood(String name) {
        if(name.equals("A")){
            return new AmericaFoodA();
        }else if(name.equals("B")){
            return new AmericaFoodB();
        }
        return null;
    }

}
