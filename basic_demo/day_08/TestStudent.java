package basic_demo.day_08;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("李白",28);
        Student s2 = new Student("荆轲",43);
        Student s3 = new Student("不知火舞",25);
        Student s4 = new Student("黄忠",70);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
        Student.showNumber();
    }
}
