package basic_demo.day_06;

public class Model {
    private int age;
    private char cup;
    private String name;

    public Model() {
    }

    public Model(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getCup() {
        return cup;
    }

    public void setCup(char cup) {
        this.cup = cup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
