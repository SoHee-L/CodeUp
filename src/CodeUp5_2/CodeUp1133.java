package CodeUp5_2;

import java.io.*;
import java.util.Scanner;

//Scanner와 BufferedReader 연습
public class CodeUp1133 {
    public static void main(String[] args) throws IOException {
       /* Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();
        System.out.print(str);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        bw.write(str);

        bw.flush();
        bw.close();
        br.close();


    }
}
