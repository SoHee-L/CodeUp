package CodeUp3;

import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();

        if (a>0) {
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        if(a%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }

}
