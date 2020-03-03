package basic_demo.day_09;

public class Teacher extends Employee {
    public void printName(){
        System.out.println("name:"+name);
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("亚瑟");
        t1.printName();
        t1.work();

    }
}
