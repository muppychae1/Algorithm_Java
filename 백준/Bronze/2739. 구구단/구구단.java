import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stage = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<10; i++){
            int result = stage * i;
            bw.write(stage + " * " + i + " = " + result + "\n");
        }
        bw.flush();
        bw.close();
    }
}