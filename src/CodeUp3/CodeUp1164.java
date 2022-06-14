package CodeUp3;

import java.util.Scanner;

public class CodeUp1163 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        int year = kb.nextInt();
        int month = kb.nextInt();
        int date = kb.nextInt();
        int sum = year+month+date;

            if ((sum % 1000)/100%2 == 0) { //ex)1902라면 1000으로 나눈 몫이 902가되고 902에서 100을 나누면 9가 된다. 9를 2로 나눴을때
                //몫이 1이면 홀수 0이면 짝수가 됨으로 그렇게 구하면 된다.
                System.out.println("대박");
            } else System.out.println("그럭저럭");
        }
    }

