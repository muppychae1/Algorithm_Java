import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine(); // 문자 입력
        int N = str.length(); // 문자열 길이
        int M = Integer.parseInt(br.readLine()); // 입력할 명령어 개수
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for(int i=0; i<N; i++) {
            stack1.add(String.valueOf(str.charAt(i)));
        }

        for(int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()) {
                case "L" :
                    if(stack1.isEmpty()){
                        break;
                    }
                    stack2.push(stack1.pop());
                    break;
                case "D" :
                    if(stack2.isEmpty()) {
                        break;
                    }
                    stack1.push(stack2.pop());
                    break;
                case "B" :
                    if(stack1.isEmpty()){
                        break;
                    }
                    stack1.pop();
                    break;
                case "P" :
                    stack1.push(st.nextToken());
                    break;
            }
        }

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        while(!stack2.isEmpty()) {
            bw.write(stack2.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}