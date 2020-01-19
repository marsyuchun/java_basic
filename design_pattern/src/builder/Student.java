package builder;

public class Student {
    private String name;
    private String email;
    private int age;

    private Student(Builder builder){
        name = builder.name;
        age = builder.age;
        email = builder.email;
    }

    // 构造方法
    public static Student.Builder builder(){
        return new Student.Builder();
    }

    // 构造器接口
    public static class Builder{
        private String name;
        private String email;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Builder email(String email){
            this.email = email;
            return  this;
        }

        public Builder age(int age){
            this.age = age;
            return  this;
        }

        public Builder name(String name){
            this.name = name;
            return  this;
        }

        public Student build(){
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
