package day4;

public class Question5 {
    public static void main(String[] args){
        int[] str1={1,2,3,4,5};
        int[] str2={2,3,4,5,6};
        int[] str3={1,2,3,4,5};

        if(cmp(str1,str2))
            System.out.println("str1和str2相等");
        else
            System.out.println("str1和str2不相等");

        if(cmp(str1,str3))
            System.out.println("str1和str3相等");
        else
            System.out.println("str1和str3不相等");

    }

    public static boolean cmp(int [] str1,int [] str2){
        boolean jug=false;
        if(str1.length==str2.length) {
            jug=true;
            for(int i=0;i<str1.length;i++){
                if(str1[i]!=str2[i]){
                    jug=false;
                    break;
                }
            }
        }
        return jug;
    }
}
