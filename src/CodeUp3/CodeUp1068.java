package CodeUp3;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args){
        Scanner kb =new Scanner(System.in);
        int score = kb.nextInt();
        if(score<=100 && score>=0){
            if(score>89){

                System.out.println("A");
            }else if (score>69){

                System.out.println("B");
            }else if (score>39){

                System.out.println("C");
            }else
                System.out.println("D");
        }
    }
}
