import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(m/45 == 0) {
            m = 60 -(45 - m);
            h-=1;
            if(h<0) {
                h = 23;
            }
        }
        else if(m/45 == 1) {
            m-=45;
        }

        bw.write(h + " " + m);
        bw.flush();
        bw.close();
    }
}