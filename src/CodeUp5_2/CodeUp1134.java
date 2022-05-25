package CodeUp5_2;

import java.util.Scanner;

class CodeUp1134 {
    public String solution(String str){
        String answer = "";
        for(char x: str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x); //isLowerCase는 소문자인지 확인해주는것 toLowerCase 소문자로 변환해주는것.
            else answer+=Character.toLowerCase(x);
        }


        return answer;

    }
    public static void main(String[] args){
        CodeUp1134 T = new CodeUp1134();
        Scanner kb = new Scanner(System.in);
        String str  = kb.next();
        System.out.println(T.solution(str));
    }
}
