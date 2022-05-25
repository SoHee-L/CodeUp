package CodeUp4_1;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0); //chatAt String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다.
        char b = 'a'; // next() "스페이스" or "공백" 전까지의 문자열 반환

        do{
            System.out.print(b++ +" ");
        }while (b<=a);

    }
}
