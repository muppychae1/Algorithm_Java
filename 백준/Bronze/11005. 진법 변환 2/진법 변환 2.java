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
        while(N != 0) {
            int remain = N % B;
            if(remain >= 10) {
                char c = (char)(remain + 55);
                result += c;
            }
            else {
                result += Integer.toString(remain);
            }
            N /= B;
        }

        for(int i=result.length()-1; i>=0; i--) {
            bw.write(result.charAt(i));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}