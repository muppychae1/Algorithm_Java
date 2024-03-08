import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        boolean isTag = false;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            // 공백이면서 tag내의 공백이 아니라면
            if(c == ' ' && !isTag) {
                // stack에 문자가 있다면 pop
                while(!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                bw.write(" ");
            }
            // '<'라면
            else if(c == '<' && !isTag) {
                isTag = true;
                while(!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                bw.write(c);
            }
            // tag의 마지막이라면
            else if(c == '>' && isTag) {
                isTag = false;
                bw.write(c);
            }
            // tag 내의 문자라면
            else if(isTag) {
                bw.write(c);
            }
            // 일반 문자라면
            else {
                stack.push(c);
            }
        } // end of for...

        while(!stack.isEmpty()) {
            bw.write(stack.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}