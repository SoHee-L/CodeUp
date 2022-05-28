package CodeUp3;

import java.util.Scanner;

public class CodeUp1152 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

       /* //else if 버전
        if(num<10){
            System.out.println("small");
        }else {
            System.out.println("big");
        }*/

        //3항 연산자자
       String num2 = (num<10)?"small" : "big"; //출력코드가 ""니 스트링으로 변수 설정.
        System.out.println(num2);


    }
}
