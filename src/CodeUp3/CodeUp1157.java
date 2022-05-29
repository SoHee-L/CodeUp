package CodeUp3;

import java.util.Scanner;

public class CodeUp1157 {
    public static void main(String[] args){
        Scanner kb =new Scanner(System.in);
        float n = kb.nextFloat(); //scanner로 정수가 아닌 실수를 담을때는 nextFloat이나 nextDouble을 사용한다.
        if(50<=n && 60>=n){
            System.out.printf("win");

        }else System.out.printf("lose");


    }
}
