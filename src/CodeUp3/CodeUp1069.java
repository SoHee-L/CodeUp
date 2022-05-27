package CodeUp3;

import java.util.Scanner;

public class CodeUp1069 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String score = kb.next();

        switch (score){
            case "A":
                System.out.println("best!!!");
                break;

            case "B":
                System.out.println("good!!");
                break;

            case "C":
                System.out.println("run!");
                break;

            case "D":
                System.out.println("slowly~");
                break;

            default:
                System.out.println("what?");
                break;
        }
    }
}
