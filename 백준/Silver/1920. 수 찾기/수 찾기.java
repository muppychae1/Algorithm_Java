import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int [] arrN = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        // 이분탐색을 위한 정렬
        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<M; i++) {
            int key = Integer.parseInt(st.nextToken());

            if(hasNumber(arrN, key) >= 0) {
                bw.write("1\n");
            }
            else {
                bw.write("0\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    /**
     * @param arrN 정렬된 배열
     * @param key 찾으려는 값
     * @return key와 일치하는 arrN의 index 값
     *          불일치일 경우, -1 반환
     */
    public static int hasNumber(int [] arrN, int key) {
        int low = 0;
        int high = arrN.length -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(key < arrN[mid]) {
                high = mid -1;
            }
            else if(key > arrN[mid]) {
                low = mid + 1;
            }
            else if(key == arrN[mid]) {
                return mid;
            }
        }

        return -1;
    }
}