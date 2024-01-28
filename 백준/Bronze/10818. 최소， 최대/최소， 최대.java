import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] numsArray = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        for(int i=0; i<N; i++){
            numsArray[i] = Integer.parseInt(st.nextToken());
        }

        int max = numsArray[0];
        int min = numsArray[0];
        for(int i=1; i<N; i++){
            if(max < numsArray[i]) {
                max = numsArray[i];
            }
            if(min > numsArray[i]){
                min = numsArray[i];
            }
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}