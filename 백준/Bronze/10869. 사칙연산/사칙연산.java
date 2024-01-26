import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(A+B));
        bw.write("\n");
        bw.write(Integer.toString(A-B));
        bw.write("\n");
        bw.write(Integer.toString(A*B));
        bw.write("\n");
        bw.write(Integer.toString(A/B));
        bw.write("\n");
        bw.write(Integer.toString(A%B));

        bw.flush();
        bw.close();
    }
}