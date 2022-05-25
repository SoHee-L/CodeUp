package CodeUp4_1;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt(); //숫자를 Num 변수에 넣어줌.
        int[] NumArr = new int[Num]; //Num을 배열 NumArr에 넣어준다. 무작위로

        for(int i=0; i<NumArr.length; i++){ //Numarr 길이만큼 0부터 돌린다.
            NumArr[i] = sc.nextInt(); // NumArr에 i값을 넣어주고
            System.out.println(NumArr[i]); // i값만큼 읽어준다.
        }

    }
}
