package builder;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = Student.builder().name("kevin").age(29).email("www.sina@163.com").build();
        System.out.println(stu);
    }
}
