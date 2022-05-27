package CodeUp5_2;

import java.util.Locale;
import java.util.Scanner;

class CodeUp1408 {
    public String solution(String str){
        String answer= "";
        String tmp= new StringBuilder(str).toString();

        for(char x:str.toCharArray()){
            if(str.equalsIgnoreCase(tmp))
                answer+=(char)(x+2);
            //TEST를 입력해서 어떻게 두개의 값을 나타낼까?..
            //결국 메소드 두개를 만들어서 해결..
        }
      return answer;
    }

    public String solution2(String str){
        String answer= "";
        String tmp= new StringBuilder(str).toString();

        for(char x:str.toCharArray()){
            if(str.equalsIgnoreCase(tmp))
                answer+=(char)(x*7%80+48);
        }
        return answer;
    }

    public static void main(String[] args){
        CodeUp1408 T = new CodeUp1408();
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));

    }
}
