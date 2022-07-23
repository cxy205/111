package day4;

public class Question4 {
    public static void main(String[] args){
        int[] num={68,27,95,88,171,996,51,210};
        int ans=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0&&(num[i]/10)%10!=7){
                ans+=num[i];
            }
        }
        System.out.println(ans);
    }
}
