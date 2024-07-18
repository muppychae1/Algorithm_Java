import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static char [][] mat;
    public static boolean [][] visited;
    public static int [] dx = {-1, 0, 1, 0};
    public static int [] dy = {0, -1, 0, 1};
    public static int cnt = 0;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if(!visited[nx][ny] && mat[x][y] == mat[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        mat = new char[N][N];
        visited = new boolean[N][N];

        // 인접 행렬 생성
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                mat[i][j] = str.charAt(j);
            }
        }

        // 정상인의 구역 찾는 dfs
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }

        bw.write(cnt + " ");

        // 초기화
        cnt = 0;
        visited = new boolean[N][N];

        // 적록색맹 R -> G 변경
        for(int i=0; i<N;i++){
            for(int j=0; j<N; j++){
                if(mat[i][j] == 'R'){
                    mat[i][j] = 'G';
                }
            }
        }

        // 적록색맹의 구역 찾는 dfs
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }

        bw.write(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}