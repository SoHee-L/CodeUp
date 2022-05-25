package CodeUp5_2;

import java.util.Scanner;

class CodeUp1406 {
    public String solution(String str){
        String answer = "";
        if(str.equals("love"))
            return "I "+str+" you.";

        return answer;
    }
    public static void main(String[] args){
        CodeUp1406 T = new CodeUp1406();
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
