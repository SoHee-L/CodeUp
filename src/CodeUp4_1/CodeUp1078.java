package CodeUp4_1;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 0;
        for(int i=0; i<=a; i++){
            if(i%2==0) {
                num += i;

            }
        }
        System.out.print(num); //밖에 있어야됨 안에있음 for문을 돌기 때문에 값이 다 찍힌다.
    }
}
