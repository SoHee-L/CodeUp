package CodeUp5_2;

import java.util.Scanner;

public class CodeUp1414 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String[] arr = str.split("");

        int a = 0;
        int b = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase("c")){
                a++;
            } else if(arr[i].equalsIgnoreCase("cC"))
                b++;
        }
        System.out.println(a);
        System.out.println(b); //CC계산이안된다.. 좀더 고민해보기

    }
}
