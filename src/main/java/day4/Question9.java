package day4;

import java.util.Random;

public class Question9 {
        public static void main(String[] args) {
            int[] str = {1,2,3,4,5};
            print(str);
        }

        public static void print(int [] str) {
            System.out.print("[");
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i] );
                if(i!=str.length-1)
                    System.out.print(",");
            }
            System.out.print("]");

        }

}
