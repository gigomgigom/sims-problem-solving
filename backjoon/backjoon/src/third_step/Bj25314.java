package third_step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        int cnt = 0;

        String answer = "";
        cnt = A/4;
        for(int i = 0; i < cnt; i++) {
            answer += "long ";
        }
        System.out.println(answer + "int");
    }
}
