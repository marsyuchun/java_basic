package basic_demo.day_08;

public class Student {
    private String name;
    private int age;
    private int gid;
    public static int studentNumber = 0;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        this.gid = ++studentNumber;
    }

    public void show(){
        System.out.println("Student name:"+this.name+", Student age:"+this.age+", Student gid:"+this.gid);
    }

    public static void showNumber(){
        System.out.println("Student gid:"+studentNumber);
    }
}
