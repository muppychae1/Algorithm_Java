import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String board = br.readLine();
        StringTokenizer x = new StringTokenizer(board, ".");
        StringTokenizer dot = new StringTokenizer(board, "X");
        String result = "";

        if(board.charAt(0) == '.') {
            result += dot.nextToken();
        }

        while(x.hasMoreTokens()) {
            String str = x.nextToken();
            int N = str.length();

            while(N > 0) {
                if(N / 4 != 0) {
                    for(int i=0; i<N/4; i++) {
                        result += "AAAA";
                    }
                    N %= 4;
                }
                if(N == 1) {
                    result = "-1";
                    break;
                }
                if(N == 0) break;
                N -=2;
                result += "BB";
            }
            if(result.equals("-1"))
                break;

            if(dot.hasMoreTokens()) {
                result += dot.nextToken();
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}