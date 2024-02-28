import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 카드 개수

        Queue<Integer> que = new LinkedList<>();

        for(int i=1; i<=N; i++){
            que.add(i);
        }

        while(que.size() > 1) {
            que.poll();
            int tmp = que.poll();
            que.add(tmp);
        }

        bw.write(que.peek() + "\n");
        bw.close();
        br.close();
    }
}