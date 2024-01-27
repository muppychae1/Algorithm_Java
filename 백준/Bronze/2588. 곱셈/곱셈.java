import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(num1*(num2%10) + "\n");
        bw.write(num1*((num2%100)/10) + "\n");
        bw.write(num1*(num2/100) + "\n");
        bw.write(Integer.toString(num1*num2));

        bw.flush();
        bw.close();
    }
}