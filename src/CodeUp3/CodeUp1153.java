package CodeUp3;

import java.util.Scanner;

public class CodeUp1153 {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();

        if(a > b){
            System.out.print(">");
        }else if(a < b){
            System.out.print("<");
        }else{
            System.out.print("=");
        }

    }
}
