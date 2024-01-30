import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        br.close();

        int[] arr = new int[26];
        int index=0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c >= 97 && c <= 122) {
                index = c-97;
            }
            if(c >= 65 && c <= 90) {
                index = c-65;
            }
            arr[index]++;
        }

        int max = arr[0];
        int maxIndex = 0;
        int maxCnt = 1;

        for(int j=1; j<arr.length; j++){
            if(max == arr[j]) {
                maxCnt++;
            }
            if(max < arr[j] ) {
                max = arr[j];
                maxIndex = j;
                maxCnt = 1;
            }
        }

        if(maxCnt == 1) {
            bw.write(maxIndex+65);
        }
        if(maxCnt > 1) {
            bw.write("?");
        }

        bw.flush();
        bw.close();
    }
}