import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            boolean [] arr = new boolean[26];
            Arrays.fill(arr, false);
            String str = br.readLine();

            int j = 0;
            int nowIdx = 0;
            int preIdx = 0;
            for(j=0; j<str.length(); j++){
                if(j > 0) {
                    preIdx = nowIdx;
                }
                nowIdx = str.charAt(j) - 'a';

                if(preIdx == nowIdx && j > 0) {
                    continue;
                }
                if(!arr[nowIdx]) { // false면,
                    arr[nowIdx] = true;
                }
                else {
                    break;
                }
            }

            if(j >= str.length()) {
                cnt++;
            }
        }// end of for

        br.close();
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}