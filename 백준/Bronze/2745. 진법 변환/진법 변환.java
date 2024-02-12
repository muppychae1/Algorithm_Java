import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int tmp = 1;
        for(int i=N.length()-1; i>=0 ;i--) {
            char c =  N.charAt(i);
            int n;

            if(c >= 'A' && c <= 'Z') {
                n = c - 'A' + 10;
            } else {
                n = c - '0';
            }

            result += n*tmp;
            tmp *= B;
        }

        br.close();
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}