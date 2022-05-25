package CodeUp5_2;

import java.util.Scanner;

class CodeUp1024 {
    public String solution(String str){
        String answer ="";
        int s = str.length();
        for(int i=0; i<s; i++){
            answer = String.valueOf(i);
        }

        return answer;
    }

    public static void main(String[] args){
        CodeUp1024 T = new CodeUp1024();
        Scanner kb= new Scanner(System.in);
        String str = kb.next();
        System.out.println("'"+T.solution(str)+"'");
    }
}
