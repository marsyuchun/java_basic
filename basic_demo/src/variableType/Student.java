package variableType;

public class Student  extends People{
    private String grade;


    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Kevin";
        System.out.println(stu.name);
    }
}
