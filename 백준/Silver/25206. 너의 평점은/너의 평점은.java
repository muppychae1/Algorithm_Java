import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        float creditSum = 0.0f;
        float multiply = 0.0f;

        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String subject = st.nextToken();
            float credit = Float.parseFloat(st.nextToken());
            String gradeName = st.nextToken();
            float grade = 0.0f;

            switch (gradeName) {
                case "A+" :
                    grade = 4.5f;
                    break;
                case "A0" :
                    grade = 4.0f;
                    break;
                case "B+" :
                    grade = 3.5f;
                    break;
                case "B0" :
                    grade = 3.0f;
                    break;
                case "C+" :
                    grade = 2.5f;
                    break;
                case "C0" :
                    grade = 2.0f;
                    break;
                case "D+" :
                    grade = 1.5f;
                    break;
                case "D0" :
                    grade = 1.0f;
                    break;
                case "F" :
                    grade = 0.0f;
                    break;
                case "P" :
                    grade = 0.0f;
                    credit = 0.0f;
                    break;
            }

            creditSum += credit;
            multiply += credit * grade;

        }

        float result = multiply / creditSum;

        bw.write(Float.toString(result));
        br.close();
        bw.flush();
        bw.close();
    }
}