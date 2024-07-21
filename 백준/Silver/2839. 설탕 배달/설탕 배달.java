import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        while(N > 0) {
            if(N % 5 == 0) {
                result += N / 5;
                break;
            }
            if(N < 3){
                result = -1;
                break;
            }
            N -= 3;
            result++;
        }

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();

    }
}