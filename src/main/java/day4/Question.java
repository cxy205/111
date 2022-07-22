package day4;

public class Question {
    public static void main(String[] args){
        while(true){
            run();
        }
    }

    public static void run(){
        for(int i=1;i<=20;i++){
            if(i==7||i==17||i%7==0){
                System.out.println(i+"过");
            }
        }
    }
}
