package CodeUp4_2;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(16);
        for(int i=1; i<16;i++){
                System.out.printf("%X*%X=%X\n",a,i,a*i); //16진수 구구단에서는 표준출력함수 %X을 지정해주기 때문에 printf를 사용해야된다.
        }
    }
}
