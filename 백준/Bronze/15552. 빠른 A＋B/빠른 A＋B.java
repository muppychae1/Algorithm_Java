import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // Testcase 개수 입력받기

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<T; i++){
            String test = br.readLine();
            StringTokenizer st = new StringTokenizer(test, " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int result = num1 + num2;
            bw.write(result+ "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}