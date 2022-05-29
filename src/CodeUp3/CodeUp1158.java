package CodeUp3;

import java.util.Scanner;

public class CodeUp1158 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        if (30 <= n && 40 >= n) {
            System.out.println("win");
        } else if (60 <= n && 70 >= n) {
            System.out.println("win");

        } else System.out.println("lose");
    }
}
