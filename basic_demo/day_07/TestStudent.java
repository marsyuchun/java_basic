package basic_demo.day_07;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        // 用数组的方式
        Student[] students = new Student[3];
        Student s1 = new Student("马云",45);
        Student s2 = new Student("马化腾",43);
        Student s3 = new Student("李彦宏",48);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0;i<students.length;i++){
            Student s = students[i];
            System.out.println(s.getName()+"‐‐‐"+s.getAge());
        }

        System.out.println("--------分割线--------");
        // 用ArrayList的方式实现
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i=0;i<list.size();i++){
            Student st =  list.get(i);
            System.out.println(st.getName()+"‐‐‐"+st.getAge());
        }


    }
}
