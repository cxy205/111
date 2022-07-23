package day5;

public class Student {
    private String name;
    private int age;
    public Student(){
    }
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void show(){
        System.out.println("学生姓名为"+name+",年龄为"+age);
    }
}
