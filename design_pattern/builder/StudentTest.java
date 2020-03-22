package design_pattern.builder;


public class StudentTest {
    public static void main(String[] args) {
        Student.Builder s = new Student.Builder();
        Student s1 = s.build();
        s1.builder().name("Mars").age(30).email("www.baidu.com").build();
        Student stu =  Student.builder().name("kevin").age(29).email("www.sina@163.com").build();
        System.out.println(stu);
    }
}
