package basic_demo.day_09;

public class SubClass extends ParentClass{
    private String name = "甄姬";

    SubClass(){

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showName(){
        System.out.println(super.getName());
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.showName();
        sc.print();
    }
}
