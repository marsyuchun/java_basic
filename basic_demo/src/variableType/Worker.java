package variableType;

public class Worker extends People{
    public final static String uid = "123243454543";
    public static final String DEPARTMENT = "Development";
    private String type;

    public static void main(String[] args) {
        Worker stu1 = new Worker();
        System.out.println(stu1.getAge());
        int age = 20;
    }
}
