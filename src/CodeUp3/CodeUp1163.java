package CodeUp3;

import java.util.Scanner;

public class CodeUp1162 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        int year = kb.nextInt();
        int month = kb.nextInt();
        int date = kb.nextInt();
        int sum = year-month+date;

            if ((sum) % 10 == 0) {
                System.out.println("대박");
            } else System.out.println("그럭저럭");
        }
    }

