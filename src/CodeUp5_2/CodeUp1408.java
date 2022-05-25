package CodeUp5_2;

import java.util.Locale;
import java.util.Scanner;

class CodeUp1408 {
    public String solution(String str){
        String answer= "";
        for(char x:str.toCharArray()){
            if(x>=65 && x<=90) answer +=(char)(x+2);
            //TEST를 입력해서 어떻게 두개의 값을 나타낼까?..
        }
      return answer;
    }
    public static void main(String[] args){
        CodeUp1408 T = new CodeUp1408();
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
