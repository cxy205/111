package day4;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        int[] str1={19,28,37,46,50};
        str1=change(str1);
        print(str1);

    }

    public static int[] change(int [] str){
        int temp;
        for(int i=0;i<str.length/2;i++){
            temp=str[i];
            str[i]=str[str.length-1-i];
        }
        return str;
    }

    public static void print(int [] str){
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
