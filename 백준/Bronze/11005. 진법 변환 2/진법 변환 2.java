import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 10진법
        int B = Integer.parseInt(st.nextToken()); // B진법

        String result = "";
        while(true) {
            int remain = N % B;
            if(remain >= 10) {
                char c = (char)(remain + 55);
                result += c;
            }
            else {
                result += Integer.toString(remain);
            }
            N /= B;
            if(N== 0) {
                break;
            }
        }

        for(int i=result.length()-1; i>=0; i--) {
            bw.write(result.charAt(i));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}