package CodeUp5_2;

import java.util.Scanner;

public class CodeUp1024 {

    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        String str = kb.next();

        int s = str.length();
        for(int i=0; i<s; i++){

            System.out.println("'"+str.charAt(i)+"'"); //charAt기억해두자 문자열을 저장해서 char타입으로 변환해줌..
        }

    }
    }

