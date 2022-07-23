package day4;
import java.util.Random;

public class Question8 {
        public static void main(String[] args) {
            float[] str = new float[6];
            str=getScore(str);
            print(str);
            float ave = getAve(str);
            System.out.println();
            System.out.println("最终成绩为" + ave);
        }
    public static float[] getScore(float [] str){
        Random  random = new Random();
        for(int i = 0; i < str.length;i++){
            str[i] = random.nextFloat()*10;
        }
        return str;
    }
    public static void print(float [] str){
            System.out.print("评委打的分数为");
            for(int i = 0;i < str.length;i++) {
                System.out.print(str[i] + ",");
            }
        }

        public static float getAve(float [] str){
            // 定义三个变量存储最大值、最小值、总和
            float maxx = str[0];
            float minn = str[0];
            float sum = 0;
            for(int i = 0;i<str.length;i++){
                if(str[i]>maxx) maxx=str[i];
                if(str[i]<minn) minn=str[i];
                sum+=str[i];
            }
            float avg = (sum - maxx - minn)/(str.length - 2);
            return avg;
        }
}
