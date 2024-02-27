import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 데이터 개수
        for(int i=0; i<T; i++) {
            String ps = br.readLine();

            bw.write(isVPS(ps) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    // VPS인지 판단하는 함수
    public static String isVPS(String ps) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<ps.length(); i++) {
            char psChar = ps.charAt(i);

            if(psChar == '(') { // '(' 일때, stack에 추가
                stack.push(psChar);
            }
            else if(psChar == ')' && !stack.empty()) { // ')' 이면서 stack에 내용이 있다면, pop
                stack.pop();
            }
            else if(psChar == ')' && stack.empty()) { // ')' 인데 stack이 비어있다면, NO
                return "NO";
            }
        }

        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}