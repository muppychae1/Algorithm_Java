import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 컴퓨터 수
        int N = Integer.parseInt(br.readLine());
        // 인접 행렬 (NxN)
        int [][] arr = new int [N+1][N+1];
        // 방문 여부 배열
        boolean [] visited = new boolean[N+1];
        // 연결된 수
        int edgeN = Integer.parseInt(br.readLine());

        for(int i=0; i<edgeN; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[r][c] = 1;
            arr[c][r] = 1;
        }

        Queue<Integer> q = new LinkedList<>();

        int cnt = 0;
        q.add(1);
        visited[1] = true;
        while(!q.isEmpty()) {
            int v = q.poll();
            for(int i=0; i<N+1; i++){
                if(arr[v][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}