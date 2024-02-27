import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arrN = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        // 이분탐색을 위한 정렬
        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());

            if(Arrays.binarySearch(arrN, key) >= 0) {
                bw.write("1\n");
            }
            else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}