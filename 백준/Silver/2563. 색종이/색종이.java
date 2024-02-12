import java.util.*;
import java.io.*;

public class Main {

    static boolean arr [][] = new boolean[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            makeSquare(x, y);
        }

        int cnt = 0;
        for(int i=0; i<101; i++) {
            for(int j=0; j<101; j++) {
                if(arr[i][j]) {
                    cnt++;
                }
            }
        }

        br.close();

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }

    public static void makeSquare(int x, int y) {
        int dx = x + 10;
        int dy = y + 10;

        for(int i=x; i<dx ; i++) {
            for(int j=y; j<dy; j++) {
                arr[i][j] = true;
            }
        }
    }
}