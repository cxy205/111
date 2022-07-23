package day4;

public class Question3 {
    public static void main(String[] args){

        for(int i=0;i<=20;i++){
            for(int j=0;j<=33;j++){
                if(i+j+(100-5*i-3*j)*3==100){
                    int m=100-j-i;
                    System.out.println("鸡翁"+i+"只，母鸡"+j+"只，鸡雏"+m+"只");
                }

            }
        }
    }
}
