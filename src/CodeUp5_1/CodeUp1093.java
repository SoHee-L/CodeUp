package CodeUp5_1;

import java.util.Scanner;
public class CodeUp1093 {
    public static void main(String args[]) {

        Scanner kb = new Scanner(System.in);
        int[] a = new int[24];
        int n = kb.nextInt();

        for(int i=0; i<n; i++){
            a[kb.nextInt()-1]++; //왜 n이라고 넣으면 다른값이 나올까?
        }
       for(int i=0; i<a.length-1; i++) System.out.print(a[i]+ "");
    }//23개일 경우 23이 나오게 하고싶으면 a.length-1로 잡고 new int[24]하던가 a.length로 잡고 new int[23]로 잡아야 답이 나온다.
}
