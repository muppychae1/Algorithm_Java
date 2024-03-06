import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> que = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++) {
            que.offer(i);
        }

        int cnt = 1;
        bw.write("<");
        while(que.size() != 1) {
            if(cnt == K) {
                bw.write(que.peek() + ", ");
                que.poll();
                cnt = 1;
            }
            else {
                que.offer(que.poll());
                cnt++;
            }
        }

        bw.write(que.poll() + ">");
        
        bw.flush();
        br.close();
        bw.close();
    }
}