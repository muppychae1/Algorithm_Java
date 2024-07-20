import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static int [][] arr;
    public static boolean [][] visited;
    public static int M;
    public static int N;
    public static int [] dx = {-1, 0, 1, 0};
    public static int [] dy = {0, -1, 0, 1};
    public static int areaCnt = 0;
    public static int areaSum = 0;
    public static List<Integer> list = new ArrayList<>();

    public static void bfs(int a, int b) {
        areaSum = 0;
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(a, b));
        visited[a][b] = true;
        areaSum++;

        while(!q.isEmpty()) {
            Point node = q.poll();
            for(int i=0; i<dx.length; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if(visited[nx][ny] || arr[nx][ny] == 1) continue;

                q.add(new Point(nx, ny));
                visited[nx][ny] = true;
                areaSum++;
            }
        }

        list.add(areaSum);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int [M][N];
        visited = new boolean [M][N];

        for(int i=0; i<K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            Point a = new Point(y1, x1);
            Point b = new Point(y2, x2);

            int dx = b.x - a.x;
            int dy = b.y - a.y;

            for(int j=a.x ; j<a.x + dx; j++) {
                for(int h=a.y; h<a.y + dy; h++) {
                    arr[j][h] = 1;
                }
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && arr[i][j] == 0){
                    bfs(i,j);
                    areaCnt++;
                }
            }
        }

        bw.write(areaCnt+"\n");
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            bw.write(list.get(i)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}