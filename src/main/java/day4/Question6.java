package day4;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        int[] str1={19,28,37,46,50};
        int f;
        System.out.println("请输入需要查找的内容：");
        Scanner input=new Scanner(System.in);
        f=input.nextInt();
        System.out.println(find(str1,f));
    }

    public static int find(int [] str,int f){
        for(int i=0;i<str.length;i++){
            if(str[i]==f)
                return i;
        }
        return -1;
    }
}
