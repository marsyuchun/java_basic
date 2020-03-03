package basic_demo.day_09;

abstract public class AnimalAbstract {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat(String name);


}
