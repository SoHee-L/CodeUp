package CodeUp5_1;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1093 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //10을 int로 변환해서 읽는 곳
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num[] = new int[23];

        while (st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            num[temp-1]++;

        }
        for(int i : num){
            bw.write(i +" ");

        }
        bw.flush();
        bw.close();
        br.close();


    }
}
