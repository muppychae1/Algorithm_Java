import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alph = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();
        br.close();

        for(int i=0; i<alph.length; i++){
            if(str.contains(alph[i])) {
                str = str.replace(alph[i], "#");
            }
        }
        bw.write(Integer.toString(str.length()));
        bw.flush();
        bw.close();
    }
}