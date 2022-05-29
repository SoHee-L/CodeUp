package CodeUp3;

import java.util.Scanner;

public class CodeUp1159 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        if (50 <= n && 70 >= n) {
            System.out.println("win");
        } else if (n%6==0) {
            System.out.println("win");

        } else System.out.println("lose");
    }
}
