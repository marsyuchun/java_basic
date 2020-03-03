package basic_demo.day_09;

public class ParentClass {
    private String name="李白";

    ParentClass(){
        System.out.println("父类构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println(name);
    }
}
