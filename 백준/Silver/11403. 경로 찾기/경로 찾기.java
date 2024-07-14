import java.io.*;
import java.util.*;

// 플로이드-와샬 알고리즘 활용
public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int [N][N];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // i > j 경우, i > k > j 경우 비교하기 위해 3중 for문
        for(int k=0; k<N; k++) {
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++) {
                    if(arr[i][k] == 1 && arr[k][j] == 1)
                        arr[i][j] = 1;
                }
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}