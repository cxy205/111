package day4;

public class Question11 {
    public static void main(String[] args) {
        int a=100;
        print(a);
        print((short)a);
        print((byte) a);
        print((long) a);
    }
    public static void print(byte a){
        System.out.println(a+"方法形参为byte");
    }
    public static void print(int a){
        System.out.println(a+"方法形参为int");
    }
    public static void print(short a){
        System.out.println(a+"方法形参为short");
    }
    public static void print(long a){
        System.out.println(a+"方法形参为long");
    }
}
