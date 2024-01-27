import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(year - 543));
        bw.flush();
        bw.close();
    }
}