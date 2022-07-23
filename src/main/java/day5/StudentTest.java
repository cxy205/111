package day5;

public class StudentTest {
    public static void main(String[] args){
        Student stu1=new Student();
        Student stu2=new Student("Alice",18);
        stu1.setName("Joy");
        stu1.setAge(20);

        stu1.show();
        stu2.show();
    }

}
