import java.io.*;
import java.util.*;

public class Main {
    public static int [][] arr;
    public static boolean [][] visited;
    public static int [] dx = {-1, 0, 1, 0};
    public static int [] dy = {0, -1, 0, 1};

    public static int cnt = 1;

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= visited[i].length || ny >= visited[i].length) continue;
            if(arr[nx][ny] == 1 && !visited[nx][ny]) {
                cnt++;
                dfs(nx, ny);
            }
        }
    }

    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        arr = new int [N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                arr[i][j] = str.charAt(j) -'0';
            }
        }

        int regionCnt = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 1 && !visited[i][j]) {
                    cnt = 1;
                    regionCnt++;
                    dfs(i, j);
                    list.add(cnt);
                }
            }
        }

        bw.write(regionCnt+"\n");
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}