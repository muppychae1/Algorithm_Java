import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cookTime = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        m += cookTime;

        if(m>=60) {
            h+=m/60;
            if(h>=24) {
                h-=24;
            }
            m%=60;
        }

        bw.write(h + " " + m);
        bw.flush();
        bw.close();
    }
}