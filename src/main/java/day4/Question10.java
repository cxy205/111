package day4;

public class Question10 {
    public static void main(String[] args) {
        int[] str = {1,2,3,4,5};
        int a=2,b=4;
        str=exchange(str,a,b);
        print(str);
    }

    public static void print(int [] str) {
        System.out.print("{");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            if(i!=str.length-1)
                System.out.print(",");
        }
        System.out.print("}");
    }

    public static int[] exchange(int [] str,int a,int b) {
        int temp=str[a];
        str[a]=str[b];
        str[b]=temp;
        return str;
    }
}
