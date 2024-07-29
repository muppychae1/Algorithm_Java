import java.io.*;
import java.util.*;

public class Main {
    public static int leafCnt = 0;
    public static ArrayList<Integer> [] parent;
    public static int root = 0;
    public static int delete;

    public static void dfs(int x) {
        if(parent[x].isEmpty()) {
            leafCnt++;
        }
        else {
            for(int i=0; i<parent[x].size(); i++) {
                if(delete == parent[x].get(i)) continue;
                dfs(parent[x].get(i));
            }
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        parent = new ArrayList[N];

        for(int i=0; i<N; i++) parent[i] = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if(value == -1) {
                root = i;
            }
            else {
                parent[value].add(i);
            }
        }

        delete = Integer.parseInt(br.readLine());

        // 삭제 노드가 루트 노드일 때
        if(delete == root) {
            leafCnt = 0;
        } else {
            for(int i=0; i<N; i++) {
                parent[i].removeIf(idx -> idx == delete);
            }
            dfs(root);
        }

        bw.write(leafCnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}