import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static int [][] mat;
    public static boolean [][] visited;

    public static int [] dx = {-1, 0, 1, 0};
    public static int [] dy = {0, -1, 0, 1};

    public static void bfs(int x, int y) {
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(x,y));
        visited[x][y] = true;

        while(!que.isEmpty()){
            Point p = que.poll();

            for(int i=0; i<dx.length; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(mat[nx][ny] == 0 || visited[nx][ny]) continue;
                que.add(new Point(nx, ny));
                visited[nx][ny] = true;
                mat[nx][ny] = mat[p.x][p.y] + 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        mat = new int [N][M];
        visited = new boolean [N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                mat[i][j] = str.charAt(j)-'0';
            }
        }

        bfs(0, 0);

        bw.write(mat[N-1][M-1]+"");
        bw.flush();
        bw.close();
        br.close();
    }
}