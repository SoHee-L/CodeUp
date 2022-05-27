package CodeUp5_2;

import java.util.Scanner;

public class CodeUp1410 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        //split은 특정문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴한다.
        String[] arr = str.split(""); // str를 한글자씩 끊어서 배열에 저장.

        int arr1 = 0;
        int arr2 = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("(")){ //i 배열에 기호가 (라면 arr1이 증가
                arr1++;
            }else if(arr[i].equals(")")){
                arr2++;
            }
        }
        System.out.println(arr1+" "+arr2);
    }
}
