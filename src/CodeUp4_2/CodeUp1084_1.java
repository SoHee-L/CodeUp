package CodeUp4_2;

import java.util.Scanner;

public class CodeUp1084 {

    public static void main(String[] args) {
        //int i, j, k, c = 0; //c는 카운트
        Scanner kb = new Scanner(System.in);
        int r = kb.nextInt();
        int g = kb.nextInt();
        int b = kb.nextInt();
        int c = 0;

        for (int i=0; i < r; i++) {
            for(int j=0; j<g; j++){
                for (int k=0; k<b; k++){
                    c++;
                    System.out.println(i+" "+j+" "+k);

                }

            }

        }
        System.out.println(c);
    }

}
