package CodeUp5_2;

import java.util.Scanner;

class CodeUp1407 {
    public String solution(String str){
        //String answer = str.replace(" ",""); //" "대신 "" 대체
       // return answer;

        //배열을 이용해서 풀음.
        String answer = "";
        String[] arr = str.split(" ");
        for(int i=0; i<arr.length; i++){
            answer+=arr[i]; //i만 answer에 값을 넣으면 아무리 string으로 형변환 해줘도 012만 나왔다... arr[]에 i값을 넣어줘야됨.
        }
        return answer;
    }
    public static void main(String[] args){
        CodeUp1407 T = new CodeUp1407();
        Scanner kb = new Scanner(System.in);
        String str  = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
