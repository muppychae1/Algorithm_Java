import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        double [] scoresArr = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        for(int i=0; i<N; i++){
            scoresArr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(scoresArr);
        double M = scoresArr[N-1];
        double sum = 0.0;
        for(int i=0; i<N; i++){
            sum += scoresArr[i]/M*100;
        }

        bw.write(sum/scoresArr.length + "\n");
        bw.flush();
        bw.close();

    }
}