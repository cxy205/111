package day4;

public class Question2 {
    public static void main(String[] args){
        int[] num=new int[25];
        num[1]=1;
        num[2]=1;
        for(int i=3;i<=20;i++){
            num[i]=num[i-1]+num[i-2];
        }
        System.out.println(num[20]);
    }
}
